package designpatterns;

import java.util.Scanner;

public class RestaurantEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		System.out.println("enter restaurant name");
		System.out.println("1.KFC \n2.Mac-D");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("KFC");
		int choice1=sc.nextInt();
		
			switch(choice1)
			{
			
			case 1:
				System.out.println("VegFood");
				break;
			case 2:
				System.out.println("Non-Veg");
				break;
			default:
				System.out.println("Invalid choice");
			}
			
			break;
		case 2:
			System.out.println("Mac-D");
			break;
		default:
			System.out.println("USer selected other restaurant");
	
		}

	}

}
