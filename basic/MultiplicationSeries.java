package basic;

import java.util.Scanner;

public class MultiplicationSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		
		for(i=1;i<n;i++)
		{
			System.out.println(i+"*"+(i+1)+"+"+(i+2));
				int product=i*(i+1);
				sum=sum+product;
				
        }
		System.out.println(sum);
		 
	}

	
	

}
