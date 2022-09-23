package classesandobject;

import java.util.Scanner;

public class SimpleInterest {

	int p,r,t;
	public SimpleInterest()
	{
		p=20000;
		r=3;
		t=2;
	}
	public SimpleInterest(int p,int r,int t)
	{
		this.p=p;
		this.r=r;
		this.t=t;
	}
	public void Interest()
	{
		int calculate=p*r*t/100;
		System.out.println("simple interest :"+calculate);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest si=new SimpleInterest();
		si.Interest();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 3 value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		SimpleInterest s1=new SimpleInterest(a, b, c);
		s1.Interest();
	}

}
