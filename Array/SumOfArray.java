package Array;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter " + size+ " the array element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
			
			System.out.println("Sum of array ="+sum);
	

	}

}
