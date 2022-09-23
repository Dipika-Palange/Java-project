package classesandobject;

import java.util.Scanner;

public class DefaultEX {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultEX de=new DefaultEX();
		de.accept();
		de.add();
		int r=de.sub();
		System.out.println("sub=" +r);
	}

}
