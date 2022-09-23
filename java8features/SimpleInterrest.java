package java8features;

@FunctionalInterface
interface Interrest
{
	float SI(float p,float r,float n);
}

@FunctionalInterface
interface Percentage{
	double Per(double a,double b,double c);
}

public class SimpleInterrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interrest s=(p,q,r)->{
			return (p*q*r)/100;
		};
		 
		Percentage p=(m1,m2,m3)->
		{
			return (m1+m2+m3)/3;
			
		};
		System.out.println("Simple Interrest : "+s.SI(5000, 3, 2));
		System.out.println("Percentage : "+p.Per(60, 70, 65));
	}

}
