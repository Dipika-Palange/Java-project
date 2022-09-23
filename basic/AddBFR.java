package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddBFR {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		int a,b,c;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter two number");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=a+b;
		System.out.println("addition="+c);

	}

}
