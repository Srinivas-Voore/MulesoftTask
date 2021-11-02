import java.sql.*;

public class JdbcSelect 
{
	public static void main(String args[])
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","root","srinivas");
		PreparedStatement  pstmt= conn.prepareStatement("select * from Movies");
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
			if(rs.getString(2).equals("Vijay")) {
				System.out.println("Movie Name is = "+ rs.getString(1) + "\n" + "actor = "+ rs.getString(2) + "\n" + "actress = " + rs.getString(3) + "\n" + "director = " + rs.getString(4) + "\n" + "year = " + rs.getString(5));
			}
		}
        conn.close();
	}
}