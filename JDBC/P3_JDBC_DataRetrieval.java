import javax.naming.Name;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class P3_JDBC_DataRetrieval {
    public static void main(String[] args) throws Exception {
//        String sql = "select * from student";
//        String url = "jdbc:mysql://localhost:3306/jfsjd";
//        String username = "root";
//        String password = "S#@!k2002";
//        Connection obj = DriverManager.getConnection(url, username, password);
//        Statement a = obj.createStatement();
//        ResultSet result = a.executeQuery(sql);
//        result.next();
//        String name = result.getInt(1) + ":" + result.getString(2);
//        System.out.println(name);

        String sql = "select * from student";
        String url = "jdbc:mysql://localhost:3306/jfsjd";
        String username = "root";
        String password = "S#@!k2002";
        Connection obj = DriverManager.getConnection(url, username, password);
        Statement a = obj.createStatement();
        ResultSet result = a.executeQuery(sql);
        while (result.next()) {
            String Name = result.getInt(1) + "-" + result.getString(2)
                    + "-" + result.getInt(3) + "-" + result.getInt(4)
                    + "-" + result.getString(5);
            System.out.println(Name);
        }
    }
}