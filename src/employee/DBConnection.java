package employee;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    public static Connection createDBConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/EmployeeDB";
            String username = "root";
            String password = "***********";
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception exp) {
            exp.printStackTrace();
        }
        return con;
    }
}
