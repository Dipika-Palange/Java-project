package classesandobject;

import java.util.Scanner;

public class ArithmaticP {
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Add=" +c);
	}
	public int sub(int a,int b)
	{
		
		return a-b;
	}
	public int mult(int a,int b)
	{
		
		return a*b;
	}
	public void div(int a,int b)
	{
		
		System.out.println("Div=" +(a/b));
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmaticP ap= new ArithmaticP();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 2 number");
		int p=sc.nextInt();
		int q=sc.nextInt();
		
		ap.add(p,q);
		int s=ap.sub(p,q);
		System.out.println("sub:"+s);
		
		int m=ap.mult(p,q);
		System.out.println("Mult:"+m);
		
		ap.div(p,q);
		
	}

}
