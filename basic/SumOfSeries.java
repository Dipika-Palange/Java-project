package basic;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,i;
		 int sum=0;
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the range of number:");
	     n=sc.nextInt();
	     
	     for(i=1;i<=n;i++)
	     {
	    	 
	         if(i%2==0)
	             sum-=i;
	         else
	             sum+=i;
	     }
	     System.out.println("The sum of the series = "+sum);

	}

}
