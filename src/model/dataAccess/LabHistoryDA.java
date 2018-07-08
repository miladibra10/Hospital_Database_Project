package model.dataAccess;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import model.entity.TestPres;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class LabHistoryDA {
    private Connection connection;
    public LabHistoryDA() {
        try {
            Class.forName(Configuration.getMysqlDriver());
            connection = (Connection) DriverManager.getConnection(Configuration.getConnectionString(), Configuration.getMysqlUser(), Configuration.getMysqlPass());
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<TestPres> getLabHistory()
    {
        ArrayList<TestPres> result = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("SELECT * FROM test NATURAL JOIN lab NATURAL JOIN sick");
            ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
            while (resultSet.next()){
                TestPres temp = new TestPres();
                temp.setDoc_id(resultSet.getString("doc_id"));
                temp.setLabName(resultSet.getString("labName"));
                temp.setSickfName(resultSet.getString("fname"));
                temp.setSicklName(resultSet.getString("lname"));
                temp.setTestName(resultSet.getString("testName"));
                result.add(temp);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
