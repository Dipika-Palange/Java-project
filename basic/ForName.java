package basic;

import java.util.Scanner;

public class ForName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		
		for(int i=0;i<5;i++ )
		{
			System.out.println(""+name);
			
		}
	}

}
