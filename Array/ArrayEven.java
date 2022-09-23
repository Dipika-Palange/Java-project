package Array;

import java.util.Scanner;

public class ArrayEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		size=sc.nextInt();
		int a[]=new int[size];
		
			System.out.println("enter " +size+ " element of array");
			for(i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
				
			}
			System.out.println("Even elements of array are");
			for(i=0;i<a.length;i++)
			{
			if(a[i]%2==0)
			{
				System.out.println(""+a[i]);
			}
			}
	}

}
