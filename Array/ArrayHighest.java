package Array;

import java.util.Scanner;

public class ArrayHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int i,size;
		int max=0;
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
			if(a[i]>max)
			max=a[i];
			
				
		}
		System.out.println("highest=" +max);
		
	}

}
