package designpatterns;

import java.util.Scanner;

interface MobileShop
{
	public void modelNo();
	public void price();
}
class IPhone implements MobileShop
{

	@Override
	public void modelNo() {
		System.out.println("IPhone6");
		
	}

	@Override
	public void price() {
		System.out.println("Rs.65000");
	}
	
}
class Samsung implements MobileShop
{

	@Override
	public void modelNo() {
		System.out.println("Samsung Galaxy");
		
	}

	@Override
	public void price() {
		System.out.println("Rs.45000");
	}
	
}

class Blackberry implements MobileShop
{

	@Override
	public void modelNo() {
		System.out.println("Blackberry Z10");
		
	}

	@Override
	public void price() {
		System.out.println("Rs.55000");
	}
	
}
class ShopKeeper
{
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop blackberry;
	
	public ShopKeeper() {
		iphone=new IPhone();
		samsung=new Samsung();
		blackberry=new Blackberry();
	}
	
	public void iphoneSale()
	{
		iphone.modelNo();
		iphone.price();
	}
	
	public void samsungSale()
	{
		samsung.modelNo();
		samsung.price();
	}
	
	public void blackberrySale()
	{
		blackberry.modelNo();
		blackberry.price();
	}
}




public class FacadePatternDemo {

	public static void main(String[] args) {
		
		int choice;
		ShopKeeper shopkeeper=new ShopKeeper();
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("enter your choice press\n 1.IPhone\n 2.Samsung\n 3. Blackberry\n 4.Exit");
		choice=sc.nextInt();
		
		switch (choice) {
		case 1:
			shopkeeper.iphoneSale();
			
			break;
		case 2:
			shopkeeper.samsungSale();
			
			break;	
		case 3:
			shopkeeper.blackberrySale();
			
			break;

		default:
				System.out.println("Invalid choice");
		}
		
	}while(choice!=4);
}
}