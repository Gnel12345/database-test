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
	//sets the connection to the database	
	Connection con=	DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/emp_datab","root","root" );
	//creates statement
	Statement s = con.createStatement();
	//executes query
	ResultSet rs = s.executeQuery("select * from Employee_Table");
	//goes through whole table and prints it to console or TestNG
	while(rs.next()){
		
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("id"));
		System.out.println(rs.getString("location"));
		System.out.println(rs.getString("age"));
		
	}
	
	}
	//Inner Join
	@Test
	public void dbtest2() throws SQLException{
		String host = "localhost";
		String port = "3306";
	//sets the connection to the database	
	Connection con=	DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/empdata","root","root" );
	//creates statement
	Statement s = con.createStatement();
	//executes query
	ResultSet rs = s.executeQuery("select Employee.firstname, Employee.lastname, EmployeeSalary.Salary From Employee Employee Inner Join EmployeeSalary ON Employee.id = EmployeeSalary.id");
	//goes through whole table and prints it to console or TestNG
	while(rs.next()){
		
		
		//System.out.println(rs.getString("id"));
		System.out.println(rs.getString("firstname"));
		System.out.println(rs.getString("lastname"));
		System.out.println(rs.getString("salary"));
	}
	
	}
	
	
	
}
