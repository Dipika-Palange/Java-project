package Array;

import java.util.Scanner;

public class AscendingDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,size,temp,j=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("enter " +size+ " element of array");
		
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		for(i=a.length-1;i>=5;i--)
		{
			System.out.println(a[i]);
		}
		
	}

}

