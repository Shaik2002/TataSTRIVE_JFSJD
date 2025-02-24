import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P4_JDBC_DataDeletion {
    public static void main(String[] args) throws Exception {
        String sql = "delete from Student where USN = 202010015";
        String url = "jdbc:mysql://localhost:3306/jfsjd";
        String username = "root";
        String password = "S#@!k2002";
        Connection obj = DriverManager.getConnection(url,username,password);
        Statement a = obj.createStatement();
        int count = a.executeUpdate(sql);
        System.out.println(count+" Row Deleted");
    }
}