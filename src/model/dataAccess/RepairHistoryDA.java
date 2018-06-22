package model.dataAccess;

import com.mysql.jdbc.Connection;
import model.entity.RepHistory;

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

    public ArrayList<RepHistory> getLabHistory()
    {
        //TODO
        return null;
    }
}
