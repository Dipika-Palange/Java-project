package basic;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int P,T,R;
		System.out.println("enter the value P ,T,R  for interest");
		Scanner sc=new Scanner(System.in);
		P=sc.nextInt();
		R=sc.nextInt();
		T=sc.nextInt();
		
		 int SI=(P*T*R)/100;
		 
		  System.out.println("simple interest " +SI);
	}

}
