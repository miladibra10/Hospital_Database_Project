package controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import model.dataAccess.Configuration;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Installer {
    public static void main(String[] args) {
        try {
            Class.forName(Configuration.getMysqlDriver());
            Connection connection = (Connection) DriverManager.getConnection(Configuration.getConnectionStringForInstall(), Configuration.getMysqlUser(), Configuration.getMysqlPass());
            connection.setAutoCommit(true);
            createDatabase(connection);
            createTables(connection);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void createDatabase(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("CREATE Database Hospital");
    }

    public static void createTables(Connection connection) throws SQLException {
        createRoom(connection);
        createSick(connection);
        createAttendent(connection);
        createPersonnel(connection);
        createRepairment(connection);
        createFood(connection);
        createDrug(connection);
        createLab(connection);
        createLabBackup(connection);
        createDoctor(connection);
        createNourishing(connection);
        createTreat(connection);
        createHospitalization(connection);
        createTest(connection);
        createWorkLab(connection);
        createRepHistory(connection);
        createPrescription(connection);
        createTestPres(connection);
        createView(connection);
        createTrigger(connection);
    }

    public static void createView(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create view sick_room as " +
                "select * from sick natural join room"
        );
    }

    public static void createTrigger(Connection connection) throws SQLException {
        createTriggerBackup(connection);
//        createTriggerRoom(connection);
    }

    public static void createTriggerRoom(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("DELIMITER $$");
        statement.execute("create TRIGGER room_cap_insert " +
                "AFTER insert on sick " +
                "for each row " +
                "begin " +
                "update room set free_cap = free_cap - 1 where room.room_id = new.room_id; " +
                "end;" +
                "$$");
        statement.execute("create TRIGGER room_cap_delete " +
                "AFTER delete on sick " +
                "for each row " +
                "begin " +
                "update room set free_cap = free_cap + 1 where room.room_id = old.room_id; " +
                "end;" +
                "$$");
        statement.execute("DELIMITER ;");
    }

    public static void createTriggerBackup(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create trigger backup_lab " +
                "before delete on lab " +
                "for each ROW " +
                "BEGIN " +
                "insert into lab_backup (lab_id,labName) VALUES (old.lab_id,old.labName); " +
                "END "
        );
    }



    public static void createAttendent(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table attendant(" +
                "national_id varchar(10) PRIMARY KEY ," +
                "fname varchar(20)," +
                "lname varchar(20)," +
                "sick_id varchar(10)," +
                "FOREIGN KEY (sick_id) REFERENCES sick(national_id)" +
                ")"
        );
    }

    public static void createDoctor(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table doctor(" +
                "doc_id varchar(10) PRIMARY KEY ," +
                "fname varchar(20)," +
                "lname varchar(20)," +
                "gender varchar(20)," +
                "speciality varchar(20)" +
                ")"
        );
    }

    public static void createDrug(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table drug(" +
                "drug_id int AUTO_INCREMENT PRIMARY KEY ," +
                "drugName varchar(20)," +
                "description varchar(150)" +
                ")"
        );
    }

    public static void createFood(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table food(" +
                "food_id int AUTO_INCREMENT PRIMARY KEY ," +
                "type varchar(20)," +
                "serve_date varchar(20)," +
                "name varchar(20)" +
                ")");
    }

    public static void createHospitalization(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table hospitalization(" +
                "national_id varchar(10)," +
                "cause varchar(20)," +
                "FOREIGN KEY (national_id) REFERENCES sick(national_id)," +
                "PRIMARY KEY (national_id,cause)" +
                ")"
        );
    }

    public static void createLab(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table lab(" +
                "lab_id int AUTO_INCREMENT PRIMARY KEY ," +
                "labName varchar(20)" +
                ")"
        );
    }

    public static void createLabBackup(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table lab_backup(" +
                "lab_id int AUTO_INCREMENT PRIMARY KEY ," +
                "labName varchar(20)" +
                ")"
        );
    }

    public static void createNourishing(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table nourishing(" +
                "national_id varchar(10)," +
                "food_id int," +
                "FOREIGN KEY (national_id) REFERENCES sick(national_id)," +
                "FOREIGN KEY (food_id) REFERENCES food(food_id)," +
                "PRIMARY KEY (national_id,food_id)" +
                ")"
        );
    }

    public static void createPersonnel(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table personnel(" +
                "national_id varchar(10) PRIMARY KEY ," +
                "fname varchar(20)," +
                "lname varchar(20)," +
                "phone varchar(13)," +
                "address varchar(50)," +
                "post varchar(20)," +
                "salary float " +
                ")"
        );
    }

    public static void createPrescription(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table prescription(" +
                "date varchar(20)," +
                "description varchar(150)," +
                "drug_id int," +
                "national_id varchar(10)," +
                "doc_id varchar(10)," +
                "FOREIGN KEY (drug_id) REFERENCES drug(drug_id)," +
                "FOREIGN KEY (national_id) REFERENCES sick(national_id)," +
                "FOREIGN KEY (doc_id) REFERENCES doctor(doc_id)," +
                "PRIMARY KEY (drug_id,national_id,doc_id)" +
                ")"
        );
    }

    public static void createRepairment(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table repairment(" +
                "repair_id int AUTO_INCREMENT PRIMARY KEY ," +
                "title varchar(20)," +
                "cost float " +
                ")"
        );
    }

    public static void createRepHistory(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table repHistory(" +
                "date varchar(20)," +
                "description varchar(150)," +
                "room_id int," +
                "national_id varchar(10)," +
                "repair_id int," +
                "FOREIGN KEY (room_id) REFERENCES room(room_id)," +
                "FOREIGN KEY (national_id) REFERENCES personnel(national_id)," +
                "FOREIGN KEY (repair_id) REFERENCES repairment(repair_id)," +
                "PRIMARY KEY (room_id,national_id,repair_id)" +
                ")"
        );
    }

    public static void createRoom(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table room(" +
                "room_id int AUTO_INCREMENT PRIMARY KEY ," +
                "capacity int," +
                "rate int," +
                "free_cap int" +
                ")"
        );
    }

    public static void createSick(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table sick(" +
                "national_id varchar(10) PRIMARY KEY ," +
                "fname varchar(20)," +
                "lname varchar(20)," +
                "enroll_date varchar(20)," +
                "end_date varchar(20)," +
                "phone varchar(13)," +
                "Bdate varchar(20)," +
                "gender varchar(20)," +
                "room_id int," +
                "FOREIGN KEY (room_id) REFERENCES room(room_id)" +
                ")"
        );
    }

    public static void createTest(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table test(" +
                "lab_id int," +
                "testName varchar(20)," +
                "FOREIGN KEY (lab_id) REFERENCES lab(lab_id)," +
                "PRIMARY KEY (lab_id,testName)" +
                ")"
        );
    }

    public static void createTestPres(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table testPres(" +
                "testName varchar(20)," +
                "lab_id int," +
                "national_id varchar(10)," +
                "doc_id varchar(10)," +
                "FOREIGN KEY (doc_id) REFERENCES doctor(doc_id)," +
                "FOREIGN KEY (national_id) REFERENCES sick(national_id)," +
                "FOREIGN KEY (lab_id,testName) REFERENCES test(lab_id,testName)," +
                "PRIMARY KEY (testName,lab_id,national_id,doc_id)" +
                ")"
        );
    }

    public static void createTreat(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table treat(" +
                "national_id varchar(10)," +
                "doc_id varchar(10)," +
                "FOREIGN KEY (national_id) REFERENCES sick(national_id)," +
                "FOREIGN KEY (doc_id) REFERENCES doctor(doc_id)," +
                "PRIMARY KEY (national_id,doc_id)" +
                ")"
        );
    }

    public static void createWorkLab(Connection connection) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        statement.execute("use Hospital");
        statement.execute("create table worklab(" +
                "lab_id int," +
                "work_time varchar(20)," +
                "FOREIGN KEY (lab_id) REFERENCES lab(lab_id)," +
                "PRIMARY KEY (lab_id,work_time)" +
                ")"
        );
    }

}
