package Array;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i;
		int even=0,odd=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("enter " +size+ " element of array");
		
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			 even++;
			}
			else
			{
				sum=sum+a[i];
				odd++;
			}
				
		}
		double avgEven=sum/even;
		double avgOdd=sum/odd;
		System.out.println("Average of even number= " +avgEven);
		System.out.println("Average of odd number= " +avgOdd);
		
	
		
	}

}
