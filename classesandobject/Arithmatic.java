package classesandobject;

import java.util.Scanner;

public class Arithmatic {
	int a,b;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 number");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void add()
	{
		int c=a+b;
		System.out.println("Add=" +c);
	}
	public int sub()
	{
		int c=a-b;
		return c;
	}
	public int mult()
	{
		int c=a*b;
		return c;
	}
	public void div()
	{
		int c=a/b;
		System.out.println("Div=" +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmatic art=new Arithmatic();
		art.accept();
		art.add();
		
		int r=art.sub();
		System.out.println("Sub=" +r);
		
		int m=art.mult();
		System.out.println("MUlt="+m);
		
		art.div();
	}

}
