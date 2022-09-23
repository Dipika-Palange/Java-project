package java8features;

@FunctionalInterface
interface SquareInt
{
	int square(int n);
}

@FunctionalInterface
interface Circle
{
	float circle(float r);
}

public class AreaOfSquare {

	public static void main(String[] args) {

		SquareInt s=n->n*n;
		System.out.println(s.square(5));
		
		Circle c=r->{
			return 3.14f*r*r;
			
		};
		System.out.println(c.circle(5));
		
	}

}
