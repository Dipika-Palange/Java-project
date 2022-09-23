package Array;

import java.util.Scanner;

public class ArrayD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		size=sc.nextInt();
		int a[]=new int[size];
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("array element are");
		for(i=0;i<a.length;i++)
		{
			System.out.println(""+a[i]);
		}

	}

}
