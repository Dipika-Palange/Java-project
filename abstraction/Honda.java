package abstraction;

public class Honda extends Bike {


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Safely");
	}
	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();
		h.display();
	}

}
