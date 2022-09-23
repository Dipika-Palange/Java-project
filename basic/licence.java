package basic;

import java.util.Scanner;

public class licence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("person is eligible for licence");
		}
		else
		{
			System.out.println("person is not eligible for licence");
		}
	}

}
