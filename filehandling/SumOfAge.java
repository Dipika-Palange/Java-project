package filehandling;
import java.util.Scanner;

public class SumOfAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size,age,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("enter " +size+ " Age in array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();

			
			if(a[i]>=18)
			{
				
			sum=sum+a[i];
		}
			System.out.println(+sum);
		}	
	}

}
