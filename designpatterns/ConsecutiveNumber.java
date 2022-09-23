package designpatterns;

import java.util.Scanner;

public class ConsecutiveNumber {

	public static void main(String[] args) {
		int flag=0; 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		if(size<0)
		{
			System.out.println("Invalid size");
			System.exit(0);
		}
				
		int a[]=new int[size];
	
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
		
		
		for(int i=0;i<a.length-1;i++)
		 {
			int d=a[i]-a[i+1]; 
			 if(d<=4||d>=-4)
			 {
				flag=1;
				
			 }
			 else
			 {
				 flag=0;
				 break;
			 }
		 }
		System.out.println(flag);
		
	}

}
