package java8features;

@FunctionalInterface
interface AddableS
{
	int add(int a,int b);
}


public class LambdaWithSinglePara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addable ad=(x,y)->x+y;
		System.out.println("Add : "+ad.add(12,2));
	}

}
