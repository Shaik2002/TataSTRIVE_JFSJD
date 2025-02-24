import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P5_JDBC_DataUpdation {
    public static void main(String[] args) throws Exception {
        String sql = "update Student set Name = 'Girish S' where USN = 202010013";
        String url = "jdbc:mysql://localhost:3306/jfsjd";
        String username = "root";
        String password = "S#@!k2002";
        Connection obj = DriverManager.getConnection(url,username,password);
        Statement a = obj.createStatement();
        int count = a.executeUpdate(sql);
        System.out.println(count+" Row Updated");
    }
}