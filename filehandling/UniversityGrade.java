package filehandling;

import java.util.Scanner;

public class UniversityGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1,m2,m3,size;
		double sum,perc;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		
		
		System.out.println("enter 3 subject marks");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		
         sum=m1+m2+m3 ;
			
		System.out.println("total="+sum);
		  perc=(sum*100)/300;

		System.out.println("percentage="+perc);
		
		
		if(perc>80)
			System.out.println("First University Grade");
		else if(perc>60)
			System.out.println("Second University Grade");
		else
			System.out.println("Third University Grade");
		
								
	}

}
