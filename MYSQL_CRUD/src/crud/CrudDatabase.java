package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudDatabase {
	
	public static void main(String[] args) {
		
		
		
	
	
	}
	
	private static String dbUrl = "jdbc:mysql://127.0.0.1:3306/newCrud";
	private static String dbUsername = "root";
	private static String dbPassword = "bhattpuja1997#";

	private Statement statement = null;

	private void dbConnect() {


	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	    statement = connection.createStatement();

	} catch(SQLException e) {
	    System.err.print(e.getMessage() + " ARGH!");
	} catch(Exception e) {
	    System.err.print(e.getMessage() + " FUUUUUUUUUU!");
	}
	}
	
	
}
