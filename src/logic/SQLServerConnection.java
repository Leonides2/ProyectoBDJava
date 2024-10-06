/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class SQLServerConnection {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=SaludPlus";
    private static final String USER = "CLI_SA";
    private static final String PASSWORD = "L!o2324*%";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            // Registrar el driver JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Establecer la conexión
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión establecida con éxito");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
