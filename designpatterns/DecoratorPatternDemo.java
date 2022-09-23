package designpatterns;

import java.util.Scanner;

interface Food{
	public String prepareFood();
	public double foodPrice();
}

class VegFood implements Food
{

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return "food";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return 50.0;
	}
	
}

abstract class FoodDecorator implements Food
{
	private Food newFood;

	public FoodDecorator(Food newFood) {
		super();
		this.newFood = newFood;
	}

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return newFood.prepareFood();
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return newFood.foodPrice();
	}
	
	
}

class NonVegFood extends FoodDecorator{

	public NonVegFood(Food newFood) {
		super(newFood);
		
	}

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood()+ " Roasted Chicken";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice()+ 150;
	}
	
}
class ChineesFood extends FoodDecorator{

	public ChineesFood(Food newFood) {
		super(newFood);
		
	}

	
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood()+ " Fried Rice and Manchurian";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice()+ 100;
	}
	
}

 
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("----------------------Food Menu----------------------");
			System.out.println("enter your choice");
			System.out.println("1.VegFood \n2.NonVegFood \n3.ChineesFood \n4.Exit");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				VegFood vegfood=new VegFood();
				System.out.println(vegfood.prepareFood());
				System.out.println(vegfood.foodPrice());
				break;
				
			case 2:
				Food f1=new NonVegFood(new VegFood());
				System.out.println(f1.prepareFood());
				System.out.println(f1.foodPrice());
				break;
				
			case 3:
				Food f2=new ChineesFood(new VegFood());
				System.out.println(f2.prepareFood());
				System.out.println(f2.foodPrice());
				break;
					
			default:
				System.out.println("Invalid choice");
			}
			
		}
		while(choice!=4);
	}
}
