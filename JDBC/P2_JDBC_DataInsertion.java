import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P2_JDBC_DataInsertion {
    public static void main(String[] args) throws Exception {
        String sql = "insert into Student values(202010015,'Soumya',22,776099856,'Mumbai')";
        String url = "jdbc:mysql://localhost:3306/jfsjd";
        String username = "root";
        String password = "S#@!k2002";
        Connection obj = DriverManager.getConnection(url,username,password);
        Statement a = obj.createStatement();
        int count = a.executeUpdate(sql);
        System.out.println(count+" Row Inserted");
    }
}