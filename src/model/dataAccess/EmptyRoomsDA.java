package model.dataAccess;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import model.entity.Room;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmptyRoomsDA {
    private Connection connection;
    public EmptyRoomsDA() {
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

    public ArrayList<Room> getFreeRooms()
    {
        ArrayList<Room> result = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("SELECT * FROM room where free_cap>0 ORDER BY room_id");
            ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
            while (resultSet.next()){
                Room temp = new Room();
                temp.setCapacity(resultSet.getInt("capacity"));
                temp.setFree_cap(resultSet.getInt("free_cap"));
                temp.setRate(resultSet.getInt("rate"));
                temp.setRoom_id(resultSet.getInt("room_id"));
                result.add(temp);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
