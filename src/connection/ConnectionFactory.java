package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tafar
 */
public class ConnectionFactory {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/projetofinalmodulo3";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("ERRO AO TENTAR CONECTAR: ", ex);
        }
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException exception) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
    
    public static void closeConnection(Connection connection, PreparedStatement stmt) {        
        closeConnection(connection);        
        try {
            if(stmt != null) {
                stmt.close();
            }
        }catch(SQLException exception) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
    
    public static void closeConnection(Connection connection, PreparedStatement stmt, ResultSet rs) {        
        closeConnection(connection, stmt);        
        try {
            if(rs != null) {
                rs.close();
            }
        }catch(SQLException exception) {
           Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, exception);
        }
    }

}
