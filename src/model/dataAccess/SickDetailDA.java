package model.dataAccess;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import model.entity.Sick;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class SickDetailDA {
    private Connection connection;
    public SickDetailDA() {
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

    public ArrayList<Sick> getSicks()
    {
        ArrayList<Sick> result = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("SELECT * FROM sick");
            ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
            while (resultSet.next()){
                Sick temp = new Sick();
                temp.setNational_id(resultSet.getString("national_id"));
                temp.setRoom_id(resultSet.getInt("room_id"));
                temp.setBdate(resultSet.getString("bdate"));
                temp.setEnd_date(resultSet.getString("end_date"));
                temp.setEnroll_dare(resultSet.getString("enroll_date"));
                temp.setFname(resultSet.getString("fname"));
                temp.setLname(resultSet.getString("lname"));
                temp.setGender(resultSet.getString("gender"));
                temp.setPhone(resultSet.getString("phone"));
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

    public ArrayList<Sick> getSickSearch(String first_name,String last_name)
    {
        ArrayList<Sick> result = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("SELECT * FROM sick where fname like ? and lname like ?");
            preparedStatement.setString(1,"%" + first_name + "%");
            preparedStatement.setString(2,"%" + last_name + "%");
            ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
            while (resultSet.next()){
                Sick temp = new Sick();
                temp.setNational_id(resultSet.getString("national_id"));
                temp.setRoom_id(resultSet.getInt("room_id"));
                temp.setBdate(resultSet.getString("bdate"));
                temp.setEnd_date(resultSet.getString("end_date"));
                temp.setEnroll_dare(resultSet.getString("enroll_date"));
                temp.setFname(resultSet.getString("fname"));
                temp.setLname(resultSet.getString("lname"));
                temp.setPhone(resultSet.getString("phone"));
                temp.setGender(resultSet.getString("gender"));
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
