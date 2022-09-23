package multithreading;

public class PriorityEx extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityEx p1=new PriorityEx();
		PriorityEx p2=new PriorityEx();
		p1.setName("Thread 1");
		p2.setName("Thread 2");
		
		p1.setPriority(MIN_PRIORITY);
		p2.setPriority(MAX_PRIORITY);
		
		p1.start();
		p2.start();
	}

	@Override
	public void run() {
		System.out.println("Thread name: " +getName()+ " Thread Priority: " +getPriority());
	}
}
