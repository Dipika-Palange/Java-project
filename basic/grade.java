package basic;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,s3,total,percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the subject marks");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		
		total=s1+s2+s3;
		 percentage= total/3;
		 System.out.println("percentage="+percentage);
		 if(percentage>=45 && percentage<=59)
		 {
			 System.out.println("pass class");
			 
		 }
		 else if(percentage>=60 && percentage<=74)
		 {
			 System.out.println("first class");
		 }
		 else if(percentage>=75 && percentage<=100)
		 {
			 System.out.println("first class with destinction");
		 }
		 else
		 {
			 System.out.println("fail ");
		 }

	}

}
