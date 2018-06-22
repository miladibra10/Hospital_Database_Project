package model.dataAccess;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import model.entity.Drug;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class DrugDetailDA {
    private Connection connection;
    public DrugDetailDA() {
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

    public ArrayList<Drug> getDrugs()
    {
        ArrayList<Drug> result = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("SELECT * FROM drug ORDER BY drug_id");
            ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
            while (resultSet.next()){
                Drug temp = new Drug();
                temp.setDrug_id(resultSet.getInt("drug_id"));
                temp.setDescription(resultSet.getString("description"));
                temp.setDrugName(resultSet.getString("drugName"));
                result.add(temp);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
