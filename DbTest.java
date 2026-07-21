import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbTest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://127.0.0.1:5432/hapoalim_db";
        String user = "postgres";
        String password = "postgres";
        
        System.out.println("Testing connection to: " + url);
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("SUCCESSFULLY CONNECTED!");
        } catch (SQLException e) {
            System.out.println("CONNECTION FAILED!");
            e.printStackTrace();
        }
    }
}
