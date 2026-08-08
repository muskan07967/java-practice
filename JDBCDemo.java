import java.sql.*;
public class JDBCDemo{
    public static void main(String[] args) {
        Connection con = DriverManager.getConnection(null);
        System.out.println("conected");
    }
}