package jdbcex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementEx {
	Connection con;
	PreparedStatement pstStatement;
	ResultSet rsset;

	public PreparedStatementEx() throws ClassNotFoundException, SQLException  {
		con=MyConnection.getMyConnection();
		System.out.println("connection get open");
	}
	public void getData(float minSalary,float maxSalary) throws SQLException
	{
		pstStatement=con.prepareStatement("select * from employee where salary between ? and ?");
		pstStatement.setFloat(1, minSalary);
		pstStatement.setFloat(2, maxSalary);
		rsset=pstStatement.executeQuery();
		while(rsset.next()) {
			System.out.print(rsset.getInt(1) + "\t");
			System.out.print(rsset.getString(2) + "\t");
			System.out.print(rsset.getString(3) + "\t");
			System.out.print(rsset.getFloat(5) + "\t");
			System.out.print(rsset.getDate(6) + "\t");
			System.out.print(rsset.getString(7) + "\t");
			System.out.println();
		}
		
	}
	public void insertRecord(int cust_id,String cust_name,String cust_address,String phone_no) throws SQLException
	{
		pstStatement=con.prepareStatement("insert into customer values(?,?,?,?)");
		pstStatement.setInt(1, cust_id);
		pstStatement.setString(2, cust_name);
		pstStatement.setString(3, cust_address);
		pstStatement.setString(4, phone_no);
		
		int n=pstStatement.executeUpdate();
		System.out.println(n+" record is inserted");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PreparedStatementEx p1=new PreparedStatementEx();
		p1.getData(20000, 40000);
		p1.insertRecord(5, "Rohan", "Mumbai", "9845231000");

	}

}
