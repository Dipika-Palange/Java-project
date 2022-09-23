package basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n , r,temp ;
		int sum=0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			 System.out.println("palindrome number "); 	
		}
			   
		else  
		{
		 System.out.println("not palindrome"); 
			
		}
	}

}


   
   