package designpatterns;

import java.util.Scanner;

public class MinimalCoins {

	public static void main(String[] args) {
		int amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount");
		amount=sc.nextInt();
		if(amount<0)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
			
		int c1,c2,c3,c4,c5,c6;
	
		c1=amount/500;
		amount=amount-(500*c1);
		c2=amount/100;
		amount=amount-(100*c2);
		c3=amount/50;
		amount=amount-(50*c3);
		c4=amount/10;
		amount=amount-(10*c4);
		c5=amount/5;
		amount=amount-(5*c5);
		c6=amount/1;
		amount=amount-(1*c6);
		
		System.out.println("Minimal coins required : "+(c1+c2+c3+c4+c5+c6));
		
		

	}

}
