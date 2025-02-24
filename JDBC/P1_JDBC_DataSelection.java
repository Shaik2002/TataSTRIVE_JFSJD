import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class P1_JDBC_DataSelection {
    public static void main(String[] args) throws Exception {
        String sql = "select Name from Student where USN = 202010010";
        String url = "jdbc:mysql://localhost:3306/jfsjd";
        String username = "root";
        String password = "S#@!k2002";
        Connection obj = DriverManager.getConnection(url,username,password);
        Statement a = obj.createStatement();
        ResultSet result = a.executeQuery(sql);
        result.next();
        String Name = result.getString(1);
        System.out.println(Name);
    }
}