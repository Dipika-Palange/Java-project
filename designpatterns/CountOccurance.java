package designpatterns;

import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		System.out.println("enter digit to find occurance");
		int digit=sc.nextInt();
		
		if(num<0||digit<0) {
			System.out.println("number is to small");
			System.exit(0);
		}
		else if(num>32767||digit>32767)
		{
			System.out.println("number is to large");
			System.exit(0);
		}
		else
		{
			while(num!=0) {
				int rem=num%10;
				num=num/10;
			
				if(rem==digit) {
					count++;
				}
			}
			System.out.println("No of occurance is : "+count);
		}
	}

}
