package designpatterns;

import java.util.Scanner;

public class FirstMiddleSame {

	public static void main(String[] args) {
	
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the array size");
			int size=sc.nextInt();
			if(size<0)
			{
				System.out.println("Invalid size");
				System.exit(0);
			}
			else if(size%2==0)
			{
				System.out.println("invalid size");
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
        CalFirstMid(array, size);
	}
	
 public static  void CalFirstMid(int array[],int size)
 {
	 for(int i=0;i<array.length;i++)
	 {
		 
		 if(array[0]==array[array.length/2])
		 {
			 System.out.println(100);
		 }
		 else
		 {
			 System.out.println(array[0]);
		 }
		 
	 }
 }
 
 
}

