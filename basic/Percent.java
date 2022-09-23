package basic;

import java.util.Scanner;

public class Percent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m1,m2,m3;
		System.out.println("enter 3 subject marks");
		Scanner sc=new Scanner(System.in);
		
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		
		double x=m1+m2+m3 ;
			
		System.out.println("total="+x);
		double  Perc=(x*100)/300;

		System.out.println("percentage="+Perc);
	}

}
