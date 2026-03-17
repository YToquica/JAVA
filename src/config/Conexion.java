package config;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // URL para Laragon: usuario 'root' y sin contraseña ""
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_productos", "root", "");
        } catch (Exception e) {
            System.err.println("Error de conexión: " + e);
        }
        return con;
    }
}