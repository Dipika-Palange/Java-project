package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		//register driver
		
		Class.forName("com.mysql.jdbc.Driver");
		
		// establish the connection 	
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/afterbatch", "root", "Dipika@11");
		
		// create statement
		
		Statement stmt=connection.createStatement();
		
		//execute statement
		
		ResultSet rSet=stmt.executeQuery("select * from contact");
		
		// retrieve the result
		
		while(rSet.next())
		{
			System.out.print(rSet.getInt("cont_id") + "\t");
			System.out.print(rSet.getString("Pname") + "\t");
			System.out.print(rSet.getString("phone_no") + "\t");
			System.out.println();
		}
		
		// close the connection 
		stmt.close();
		connection.close();
		
	}

}
