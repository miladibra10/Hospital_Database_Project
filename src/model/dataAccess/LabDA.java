package model.dataAccess;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import model.entity.Lab;
import model.entity.Room;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class LabDA {
    private Connection connection;
    public LabDA() {
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

    public ArrayList<Lab> getLabs()
    {
        ArrayList<Lab> result = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("SELECT * FROM lab ORDER BY lab_id");
            ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
            while (resultSet.next()){
                Lab temp = new Lab();
                temp.setLab_id(resultSet.getInt("lab_id"));
                temp.setLabName(resultSet.getString("labName"));
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
