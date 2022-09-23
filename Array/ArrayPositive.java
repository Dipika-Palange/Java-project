package Array;

import java.util.Scanner;

public class ArrayPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i;
		int p=0,n=0,z=0;
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
			if(a[i]>0)
				p++;
			else if(a[i]<0)
				n++;
			else
			z++;
		}
		System.out.println("frequncy of positive number= " +p);
		System.out.println("frequncy of negative  number= " +n);
		System.out.println("frequncy of Zeros number= " +z);

		
	}

}
