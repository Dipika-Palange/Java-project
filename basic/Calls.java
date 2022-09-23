package basic;

import java.util.Scanner;

public class Calls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int call ,amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of calls");
		call=sc.nextInt();
		System.out.println("Total calls are" +call);
		
		if(call<=200)
		{
			amount=call*1;
			
		}
		else
		{
			amount=call*3;
		}
		System.out.println("amount are " +amount);

	}

}
