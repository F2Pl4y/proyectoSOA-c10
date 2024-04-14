package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String url = "jdbc:mysql://localhost:3306/supermercado";
    private static final String user = "root";
    private static final String password = "";

    public static Connection conectar() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn != null ? conn : null;
    }

}
