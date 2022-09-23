package abstraction;

	abstract class Bank
	{
		public abstract void getBalance();
	}
	
	class BankA extends Bank
	{

		@Override
		public void getBalance() {
			// TODO Auto-generated method stub
			System.out.println("Deposite balance are $100");
		}
		
	}

	class BankB extends Bank
	{

		@Override
		public void getBalance() {
			// TODO Auto-generated method stub
			System.out.println("Deposite balance are $150");
		}
		
	}
	class BankC extends Bank
	{

		@Override
		public void getBalance() {
			// TODO Auto-generated method stub
			System.out.println("Deposite balance are $200");
		}
		
	}
public class BankBalance {
	public static void main(String[] args) {
		BankC bc=new BankC();
		BankB bb=new BankB();
		BankA ba=new BankA();
		
		ba.getBalance();
		bb.getBalance();
		bc.getBalance();
		
	}

}
