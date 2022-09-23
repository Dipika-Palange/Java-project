package basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n , r,temp ;
		double sum=0;
	    int  count=0;
		double p;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			count++;
			r=n%10;
			p=(Math.pow(r,count));
			sum=sum+p;
			n=n/10;
		}
		System.out.println("number count= "+count); 
		if(temp==sum)
		{
			 System.out.println("Armstrong number "); 	
		}
			   
		else  
		{
		 System.out.println("not Armstrong number"); 
		}	
	}

}
