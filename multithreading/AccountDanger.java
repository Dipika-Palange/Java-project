package multithreading;

public class AccountDanger implements Runnable{
	
	private Account acct =new Account();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountDanger  danger=new AccountDanger ();
		Thread t1=new Thread(danger);
		Thread t2=new Thread(danger);
		
		t1.setName("Raj");
		t2.setName("Meera");
		t1.start();
		t2.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			makeWithdraw(1000);
		}
	}
	
	private synchronized void makeWithdraw(int amount)
	{
		if(acct.getBalance()>=amount)
		{
			System.out.println(Thread.currentThread().getName()+ " is going to withdraw");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acct.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+ " complete withdraw. Balance: " +acct.getBalance());
		}
		else
		{
			System.out.println("Not enough balance in account for"+Thread.currentThread().getName()+ " Balance: "+acct.getBalance());
		}
	}
	

}
