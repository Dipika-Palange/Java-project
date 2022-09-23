package basic;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount,discountAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount");
		amount=sc.nextInt();
		
		if(amount>10000)
		{
			discountAmount=amount*10/100;
			
		}
		
		else
		{
			discountAmount=amount*2/100;
		}
		System.out.println("dicount amount="+discountAmount);
	}

}
