package model.dataAccess;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import model.entity.RepHistory;
import model.entity.Sick;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class RepairHistoryDA {
    private Connection connection;
    public RepairHistoryDA() {
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

    public ArrayList<RepHistory> getRepairHistory()
    {
        ArrayList<RepHistory> result = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("SELECT * FROM repHistory natural join repairment natural join personnel");
            ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
            while (resultSet.next()){
                RepHistory temp = new RepHistory();
                temp.setDate(resultSet.getString("date"));
                temp.setDescription(resultSet.getString("description"));
                temp.setPersonnelfName(resultSet.getString("fname"));
                temp.setPersonnellName(resultSet.getString("lname"));
                temp.setTitle(resultSet.getString("title"));
                temp.setRoom_id(resultSet.getInt("room_id"));
                result.add(temp);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
