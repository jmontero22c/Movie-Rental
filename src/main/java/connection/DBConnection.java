package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jesus
 */
public class DBConnection {
    Connection connection;
    static String bd = "movies_rental";
    static String port = "3306";
    static String login = "root";
    static String password = "admin";
    
    public DBConnection(){
        try {
            Class.forName("com.mysql.jdbc.driver");
            String url = "jdbc:mysql://localhost:"+this.port + "/" + this.bd;
            connection = DriverManager.getConnection(url,this.login, this.password);
            System.out.println("Conexión establecida");
        }catch (Exception ex) {
            System.out.println("Error en conexión");
        }
    }
    
    public Connection getConnection(){
        return this.connection;
    }
    
    public void desconectar(){
        connection = null;
    }
}
