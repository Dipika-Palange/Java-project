package jdbcex;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class PreparedStatementEx2 {
	
	
	Connection con;
	PreparedStatement pstStatement;
	ResultSet rsset;

	public PreparedStatementEx2() throws ClassNotFoundException, SQLException  {
		con=MyConnection.getMyConnection();
		System.out.println("connection get open");
	}
	
	public void getData(float  minpercentage,float maxpercentage) throws SQLException
	{
		pstStatement=con.prepareStatement("select * from student where percentage between ? and ? ");
		pstStatement.setFloat(1, minpercentage);
		pstStatement.setFloat(2, maxpercentage);
		rsset=pstStatement.executeQuery();
		
		while(rsset.next())
		{
			System.out.print(rsset.getInt(1)+ "\t");
			System.out.print(rsset.getString(2)+ "\t");
			System.out.print(rsset.getDate(3)+ "\t");
			System.out.print(rsset.getString(4)+ "\t");
			System.out.println();
			
		}
		
	}
		public void insertRecordS(int studentId,String studentname,String dob,String city,float percentage)throws SQLException
		
		{
			pstStatement=con.prepareStatement("insert into student values(?,?,?,?,?)");
			pstStatement.setInt(1, studentId);
			pstStatement.setString(2, studentname);
			pstStatement.setObject(3, dob);
			pstStatement.setString(4,city);
			pstStatement.setFloat(5, percentage);
			
			int n=pstStatement.executeUpdate();
			System.out.println(n+" record is inserted");
		}
		
		
		public void deleteRecord(int cust_id) throws SQLException
		{
			pstStatement=con.prepareStatement("delete from customer where cust_id=?");
			pstStatement.setInt(1, cust_id);
			
			int p=pstStatement.executeUpdate();
			System.out.println(p+ "record is deleted");
			
		}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PreparedStatementEx2 p1=new PreparedStatementEx2();
		//p1.getData(60,80);
		//p1.insertRecordS(9, "Disha", "1999-11-07","Thane",66);

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the percentage");
		float min=sc.nextFloat();
		float max=sc.nextFloat();
		p1.getData(min, max);
		
		
		System.out.println("enter student details");
		int id=sc.nextInt();
		String name=sc.nextLine();
		sc.nextLine();
		String dob=sc.nextLine();
		LocalDate ldate=LocalDate.parse(dob);
 
		String city=sc.nextLine();
		sc.nextLine();
		float per=sc.nextFloat();
		
		p1.insertRecordS(id, name, dob, city, per);
		
		
		
		
		System.out.println("enter customer id");
		int cid=sc.nextInt();
		p1.deleteRecord(id);
		
		
	}

}
