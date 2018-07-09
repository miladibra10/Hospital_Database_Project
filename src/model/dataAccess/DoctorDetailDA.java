package model.dataAccess;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import model.entity.Doctor;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
public class DoctorDetailDA {
    private Connection connection;
    public DoctorDetailDA() {
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

    public ArrayList<Doctor> getDoctors()
    {
        ArrayList<Doctor> result = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("SELECT * FROM doctor");
            ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
            while (resultSet.next()){
                Doctor temp = new Doctor();
                temp.setDoc_id(resultSet.getString("doc_id"));
                temp.setFname(resultSet.getString("fname"));
                temp.setLname(resultSet.getString("lname"));
                temp.setGender(resultSet.getString("gender"));
                temp.setSpeciality(resultSet.getString("speciality"));
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
