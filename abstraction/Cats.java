package abstraction;

public class Cats  extends Animal{

	@Override
	public void cats() {
		// TODO Auto-generated method stub
		System.out.print("Cats meow");
	}
	
	@Override
	public void dogs() {
		// TODO Auto-generated method stub
		System.out.println("Dogs bark");
	}

	
	public static void main(String[] args) {
		Cats a=new Cats();
		a.cats();
		a.dogs();
		
	}
	
}
