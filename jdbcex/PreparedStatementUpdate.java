package jdbcex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementUpdate {
	

	Connection con;
	PreparedStatement pstStatement;
	ResultSet rsset;

	public PreparedStatementUpdate() throws ClassNotFoundException, SQLException {
		
	con= MyConnection.getMyConnection();
	System.out.println("connection is open");
	}
	

	public void deleteRecord(int cust_id) throws SQLException
	{
		pstStatement=con.prepareStatement("delete from customer where cust_id=?");
		pstStatement.setInt(1, cust_id);
		
		int p=pstStatement.executeUpdate();
		System.out.println(p+ "record is deleted");
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		PreparedStatementUpdate pu=new PreparedStatementUpdate();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer id");
		int cid=sc.nextInt();
		pu.deleteRecord(cid);
		
	}

}
