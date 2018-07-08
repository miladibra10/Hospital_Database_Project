package controller;

import com.mysql.jdbc.Connection;
import model.dataAccess.Configuration;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Installer {
    public static void main(String[] args) {
        try {
            Class.forName(Configuration.getMysqlDriver());
            Connection connection = (Connection) DriverManager.getConnection(Configuration.getConnectionString(), Configuration.getMysqlUser(), Configuration.getMysqlPass());
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void createTables(Connection connection)
    {
        //TODO
    }

    public static void createView(Connection connection)
    {
        //TODO
    }

    public static void createTrigger(Connection connection)
    {
        //TODO
    }

    public static void createAttendent(Connection connection)
    {
        //TODO
    }

    public static void createDoctor(Connection connection)
    {
        //TODO
    }

    public static void createDrug(Connection connection)
    {
        //TODO
    }

    public static void createFood(Connection connection)
    {
        //TODO
    }

    public static void createHospitalization(Connection connection)
    {
        //TODO
    }

    public static void createLab(Connection connection)
    {
        //TODO
    }

    public static void createNourishing(Connection connection)
    {
        //TODO
    }

    public static void createPersonnel(Connection connection)
    {
        //TODO
    }

    public static void createPrescription(Connection connection)
    {
        //TODO
    }

    public static void createRepairment(Connection connection)
    {
        //TODO
    }

    public static void createRepHistory(Connection connection)
    {
        //TODO
    }

    public static void createRoom(Connection connection)
    {
        //TODO
    }

    public static void createSick(Connection connection)
    {
        //TODO
    }

    public static void createTest(Connection connection)
    {
        //TODO
    }

    public static void createTestPres(Connection connection)
    {
        //TODO
    }

    public static void createTreat(Connection connection)
    {
        //TODO
    }

    public static void createWorkLab(Connection connection)
    {
        //TODO
    }

}
