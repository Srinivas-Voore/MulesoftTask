import java.sql.*;
import java.util.*;

public class JdbcCreateTable
{
	public static void main(String args[])
	{
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "root", "srinivas");
		Statement st= conn.createStatement();
		String qry ="create table Movies(name varchar2(10),actor varchar2(10),actress varchar2(10),director varchar2(10),yearofrelease varchar2(10))";
		int res = st.executeUpdate(qry);
		System.out.println("Table created");
	}
}