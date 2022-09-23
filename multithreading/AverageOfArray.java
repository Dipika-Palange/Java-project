package multithreading;

import java.util.Scanner;

public class AverageOfArray {

 
	 public float avg(int []arr,int size)
			{
		 		int sum=0;
		 		for(int i=0;i<size;i++)
		 		{
		 			sum=sum+arr[i];
		 		}
		 		float Avg=sum/size;
		 		
		 		return Avg;
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=sc.nextInt();
		if(size<0 || size>20)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		int Array[]=new int[size];
		System.out.println("Enter "+size+" element in array");
		
		for(int i=0;i<size;i++)
		{
			Array[i]=sc.nextInt();
			if(Array[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
		AverageOfArray ag=new AverageOfArray();
		float f=ag.avg(Array, size);
		System.out.println(String.format("%.2f", f));
	}

}
