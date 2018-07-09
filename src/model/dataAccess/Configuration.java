package model.dataAccess;

public class Configuration {
    private static final String mysqlDriver = "com.mysql.jdbc.Driver";
    private static final String mysqlUser = "root";
    private static final String mysqlPass = "est946p1376104";
    private static final String connectionStr = "jdbc:mysql://localhost/";
    private static final String dataBaseName = "Hospital";

    public static String getMysqlDriver() {
        return mysqlDriver;
    }

    public static String getMysqlUser() {
        return mysqlUser;
    }

    public static String getMysqlPass() {
        return mysqlPass;
    }

    public static String getConnectionStr() {
        return connectionStr;
    }

    public static String getDataBaseName() {
        return dataBaseName;
    }

    public static String getConnectionString() {
        return connectionStr;
    }
}
