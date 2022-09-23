package classesandobject;

import java.util.Scanner;

public class Employee {

	int id,WorkingDay,PerDaySalary;
	String name;
	
	
	public Employee()
	{
		id=2;
		WorkingDay=30;
		PerDaySalary=1500;
		name="Reva";
		
	}
	public Employee(int id,String name,int WorkingDay,int PerDaySalary)
	{
		this.id=id;
		this.name=name;
		this.WorkingDay =WorkingDay;
		this.PerDaySalary=PerDaySalary;
	}
	public void salary()
	{
		
		int total=WorkingDay*PerDaySalary;
		System.out.println("salary:"+total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.salary();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employee id");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name");
		String nm=sc.nextLine();
		
		System.out.println("enter the working days");
		int w=sc.nextInt();
		System.out.println("enter the per day salary");
		int s=sc.nextInt();
		
		Employee e1=new Employee(n, nm, w, s);
		e1.salary();
	}

}
