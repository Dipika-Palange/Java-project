package jdbcex;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class StudentManagementSystem {

	Connection connection;
	PreparedStatement preparedStatement;
	CallableStatement callableStatement;
	ResultSet resultSet;
	
	public StudentManagementSystem() throws ClassNotFoundException, SQLException {
		connection=MyConnection.getMyConnection();
		System.out.println("Connection is open");
	}
	
	public void insertStudent(int rollNo,String name,LocalDate date,float percentage,String city,String emailId,String phoneNo) throws SQLException
	{
		callableStatement =connection.prepareCall("{call Student_Records(?,?,?,?,?,?,?)}");
		
		callableStatement.setInt(1, rollNo);
		callableStatement.setString(2, name);
		callableStatement.setObject(3, date);
		callableStatement.setFloat(4, percentage);
		callableStatement.setString(5, city);
		callableStatement.setString(6, emailId);
		callableStatement.setString(7, phoneNo);
		
		callableStatement.execute();
		System.out.println("Inserted successfully");
	}
	public void displayStudent() throws SQLException {
		preparedStatement = connection.prepareStatement("select * from StudentR");
		while(resultSet.next()) {
			System.out.print(resultSet.getInt(1)+"\t");
			System.out.print(resultSet.getString(2)+"\t");
			System.out.print(resultSet.getDate(3)+"\t");
			System.out.print(resultSet.getFloat(4)+"\t");
			System.out.print(resultSet.getString(5)+"\t");
			System.out.print(resultSet.getString(6)+"\t");
			System.out.print(resultSet.getString(7));
		}
	}
	
	public void displayStudentByCity(String City) throws SQLException {
		preparedStatement = connection.prepareStatement("Select * from StudentR where city = ?");
		preparedStatement.setString(1, City);
		resultSet= preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.print(resultSet.getInt(1)+"\t");
			System.out.print(resultSet.getString(2)+"\t");
			System.out.print(resultSet.getDate(3)+"\t");
			System.out.print(resultSet.getFloat(4)+"\t");
			System.out.print(resultSet.getString(5)+"\t");
			System.out.print(resultSet.getString(6)+"\t");
			System.out.print(resultSet.getString(7));
		}
	}
	
	public void updateStudent(int rollNo , String sName,LocalDate dob,float percentage,String city,String email_id,String phone_no) throws SQLException {
		preparedStatement = connection.prepareStatement("update StudentR set sname = ? ,dob=?,percentage=?,city=?,email_id=?,phone_no=? where rollno=?");
		preparedStatement.setString(1,sName);
		preparedStatement.setObject(2,dob);
		preparedStatement.setFloat(3,percentage);
		preparedStatement.setString(4,city);
		preparedStatement.setString(5,email_id);
		preparedStatement.setString(6,phone_no);
		preparedStatement.setInt(7,rollNo);
		int n =preparedStatement.executeUpdate();
		System.out.println(n+" records updated successfully");
	}
	
	public void deleteStudent(int rollNo) throws SQLException {
		preparedStatement = connection.prepareStatement("delete from StudentR where rollno=?");
		preparedStatement.setInt(1, rollNo);
		int n = preparedStatement.executeUpdate();
		System.out.println(n+" record deleted.");
	}
	
	public void searchStudentByPercentage(float minPercentage,float maxPercentage) throws SQLException {
		preparedStatement = connection.prepareStatement("select * from StudentR where percentage between ? and ?");
		preparedStatement.setFloat(1, minPercentage);
		preparedStatement.setFloat(2, maxPercentage);
		resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.print(resultSet.getInt(1)+"\t");
			System.out.print(resultSet.getString(2)+"\t");
			System.out.print(resultSet.getDate(3)+"\t");
			System.out.print(resultSet.getFloat(4)+"\t");
			System.out.print(resultSet.getString(5)+"\t");
			System.out.print(resultSet.getString(6)+"\t");
			System.out.print(resultSet.getString(7));
		}
		
	}
	
	public void topper() throws SQLException {
		preparedStatement = connection.prepareStatement("select * from StudentR where percentage=(select max(percentage)from StudentR)");
		resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.print(resultSet.getInt(1)+"\t");
			System.out.print(resultSet.getString(2)+"\t");
			System.out.print(resultSet.getDate(3)+"\t");
			System.out.print(resultSet.getFloat(4)+"\t");
			System.out.print(resultSet.getString(5)+"\t");
			System.out.print(resultSet.getString(6)+"\t");
			System.out.print(resultSet.getString(7));
		}
	}
	
	public void serachStudentById(int rollNo) throws SQLException 
	{
		preparedStatement = connection.prepareStatement("select * from StudentR where rollno=?");
		preparedStatement.setInt(1, rollNo);
		resultSet= preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.print(resultSet.getInt(1)+"\t");
			System.out.print(resultSet.getString(2)+"\t");
			System.out.print(resultSet.getDate(3)+"\t");
			System.out.print(resultSet.getFloat(4)+"\t");
			System.out.print(resultSet.getString(5)+"\t");
			System.out.print(resultSet.getString(6)+"\t");
			System.out.print(resultSet.getString(7));
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentManagementSystem sms=new StudentManagementSystem();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.add Student record \r\n"
				+ "2.View all Student details\r\n"
				+ "3.View Student by city name\r\n"
				+ "4.update student details by rollno\r\n"
				+ "5.delete student by rollno\r\n"
				+ "6.Search Student on the basis of Percentage\r\n"
				+ "7.display details of 1st Ranker\r\n"
				+ "8.search student details by id\r\n");
		
		
		int ch = sc.nextInt();
		
		switch(ch)
		{
		
		case 1:
			System.out.println("enter student Record");
			int id=sc.nextInt();
			String name=sc.nextLine();
			sc.next();
			String dob=sc.next();
			LocalDate lDate=LocalDate.parse(dob);
			float perc=sc.nextFloat();
			String ct=sc.nextLine();
			String emailId=sc.nextLine();
			sc.next();
			String MobNo=sc.nextLine();
			
			sms.insertStudent(id, name, lDate, perc, ct, emailId, MobNo);
			break;
			
		case 2:
			
				sms.displayStudent();
				break;
			
		case 3 :
			String ct1=sc.nextLine();
				sms.displayStudentByCity(ct1);
				break;
			
		default:
				System.out.println("invalid choice");
		}
		
		
	}

}
