package maruf.JDBC;
import java.sql.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	String url = "jdbc:mysql://localhost:3306/ghoraghuri_v1";
    	String user = "root";
    	String pass = "";
    	String q = "SELECT name FROM `district` WHERE id = 1";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(q);
        rs.next();
        String name = rs.getString("name");
        System.out.println(name);
        rs.close();
        con.close();
    }
}
