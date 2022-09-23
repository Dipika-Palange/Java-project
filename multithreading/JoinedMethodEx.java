package multithreading;

public class JoinedMethodEx extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JoinedMethodEx t1=new JoinedMethodEx();
		JoinedMethodEx t2=new JoinedMethodEx();
		JoinedMethodEx t3=new JoinedMethodEx();
		 t1.start();
		 try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 t2.start();
		 t3.start();
		 
	}

	@Override
	public void run() {

		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
