package multithreading;
import java.util.Scanner;

public class DiffLargeSmall {

	public int SecondMaxMinDiff(int []arr,int size)
	{
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>=arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		return (arr[size-2]-arr[1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=sc.nextInt();
		if(size<0)
		{
			System.out.println("invalid array size");
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
		DiffLargeSmall ds=new DiffLargeSmall();
		System.out.println("Difference between second Largest and second Smallest is: " +ds.SecondMaxMinDiff(Array, size));
	}

}
