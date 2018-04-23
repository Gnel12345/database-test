package databaseTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;



public class DatabaseTestMain {

	@Test
	public void dbtest() throws SQLException{
		String host = "localhost";
		String port = "3306";
		
	Connection con=	DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/emp_datab","root","root" );
	Statement s = con.createStatement();
	ResultSet rs = s.executeQuery("select * from Employee_Table");
	while(rs.next()){
		
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("id"));
		System.out.println(rs.getString("location"));
		System.out.println(rs.getString("age"));
		
	}
	
	}
	
}
