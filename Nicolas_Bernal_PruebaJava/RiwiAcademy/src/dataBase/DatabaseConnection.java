package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    static String url = "jdbc:mysql://localhost:3306/RiwiAcademyDB";
    static String user = "root";
    static String password = "Rlwl2023.";


    public static <Connection> Connection getConnection() throws SQLException {
        return (Connection) DriverManager.getConnection(url, user, password);
    }

    public static void closeConnection(Connection connection) throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}

