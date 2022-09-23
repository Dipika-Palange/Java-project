package classesandobject;

import java.util.Scanner;

public class Percentage {

	int id,m1,m2,m3;
	String name;
	public Percentage()
	{
		id=2;
		m1=60;
		m2=70;
		m3=60;
		name="Neha";
	}
	public Percentage(int id,int m1,int m2,int m3,String name) 
	{
		this.id=id;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.name=name;
	}
	public  void calculate()
	{
		int result=m1+m2+m3;
		int percent=result/3;
		System.out.println("percentage="+percent);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Percentage p=new Percentage();
		p.calculate();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int a=sc.nextInt();
		System.out.println("enter the marks");
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println("enter the name");
		String n=sc.nextLine();
		
		Percentage p1=new Percentage(d, b, c, d, n);
		p1.calculate();
	}

}
