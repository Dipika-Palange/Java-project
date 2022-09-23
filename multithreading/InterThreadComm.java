package multithreading;

class Customer
{
	private int amount=10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw. "+amount);
		if(this.amount<amount)
		{
			System.out.println("Less Balance.waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount-=10000;
		System.out.println("Withdraw completes");
	}
	synchronized void deposit(int amount)
	{
		System.out.println("going to deposit Rs. "+amount);
		this.amount+=amount;
		System.out.println("deposit completes.Balance: Rs. "+this.amount);
		notify();
	}
}
public class InterThreadComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		new Thread("Raj") {
			public void run() {
				customer.withdraw(10000);
			}
		}.start();
		new Thread("Ravi") {
			public void run() {
				customer.deposit(10000);
			}
			
		}.start();

	}

}
