package java8features;

import java.util.Scanner;

public class ClearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		if(size<0)
		{
			System.out.println("Invalid size");
			System.exit(0);
		}
		
		int array[]=new int[size];
	
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
			if(array[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
		
		clearedTest1(array,size);
	}
	
	
	static int j;
	static int cleared[]=new int[10];
	public  static void clearedTest1(int array[],int size)
	{
		
		for(int i=0;i<array.length;i=i+3)
		{
			if(array[i+1]>=70 && array[i+2]>=70)
			{
				cleared[j]=array[i];
				j++;
			}
		}
			
	
		for(int k=0;k<j;k++)
		{
			System.out.println(cleared[k]);
		}
	}

}
