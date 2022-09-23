package classesandobject;

import java.util.Scanner;

public class Parameterized {
	
	public void add(int a,int b)
	{
		System.out.println("Add:"+(a+b));
	}
	public int sub(int a,int b)
	{
		return  a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized pd=new Parameterized();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int p=sc.nextInt();
		int q=sc.nextInt();
		
		pd.add(p,q);
		
		int r=pd.sub(p,q);
		System.out.println("sub:"+r);
	}

}
