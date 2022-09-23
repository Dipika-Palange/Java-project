

import java.util.Scanner;

abstract class bank
{
	public abstract float  getRateOfInterest(); {
		
	} 
	
}

class SBI extends bank
{

	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6.4f;
	}
	
}
class ICICI extends bank
{

	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7.4f;
	}
	
}
public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principle amount and no. of years ");
		float pAmount=sc.nextFloat();
		float year=sc.nextFloat();
		
		bank b,b1;
		b=new SBI();
		b1=new ICICI();
		
		float rsbi=b.getRateOfInterest();
		float ricici=b1.getRateOfInterest();
		
		
		System.out.println("simple interest for SBI= "+(pAmount*year*rsbi)/100);
		System.out.println("simple interest for SBI= "+(pAmount*year*ricici)/100);

	}

}
