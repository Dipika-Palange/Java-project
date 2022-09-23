package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	static Connection con;
	
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException
	{
	
		if(con==null) {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/afterbatch", "root", "Dipika@11");
			
			return con;
		}
		else
		{
			return con;
		}
		
	}

}
