package jdbcex;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

 public class CollableStatementEx {
	
	Connection con;
	
	CallableStatement cStatement;
	
	public CollableStatementEx() throws ClassNotFoundException, SQLException {
		
		con=MyConnection.getMyConnection();
		System.out.println("connection get open");
	}

	public void callingProcedure(int id,String user_name) throws SQLException
	{
		cStatement =con.prepareCall("{call insertRecord(?,?)}");
		cStatement.setInt(1,id);
		cStatement.setString(2,user_name);
	 
		cStatement.execute();
		System.out.println("inserted successfully");
		
		
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		CollableStatementEx c1=new CollableStatementEx();
		c1.callingProcedure(2, "Prashant");
	}

}
