/* JDBC Demo for Inserting into Table */
import java.sql.*;

public class JdbcInsert {
	public static void main(String[] args) 
    {	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
    		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "root","srinivas");
    		PreparedStatement pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?)");
    		pstmt.setString(1, "Arjun Reddy");
    		pstmt.setString(2, "Vijay");    			
    		pstmt.setString(3, "Rashmika");
    		pstmt.setString(4, "Parasuram");
    		pstmt.setString(5, "2018");
    		boolean n = pstmt.execute();   			
    	}
		catch(Exception e) {		
			System.out.println(e);  
		}
	}
}