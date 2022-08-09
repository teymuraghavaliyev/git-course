import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {


    Connection connection =  null;

    public DBConnection() throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();
    }
    public Connection getConnection(String url,String username,String password) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }


}
