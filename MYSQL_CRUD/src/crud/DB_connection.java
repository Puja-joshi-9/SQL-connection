package crud;

import java.sql.*;


public class DB_connection {
	
	public static void main(String[] args) {
		
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/newCrud", "root", "bhattpuja1997#");
			System.out.println("Done!");
			Statement stm = connection.createStatement();
			ResultSet result = stm.executeQuery("select * from user");
			while(result.next()) {
			System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getInt(3)+" "+result.getString(4));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}

}

