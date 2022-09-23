package basic;
import java.util.Scanner ;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("enter two numbers");
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=a+b;
		
		System.out.println("Addition= " +c);
	}

}
