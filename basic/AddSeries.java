package basic;

import java.util.Scanner;

public class AddSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
        int n;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of terms in series:");
        n = s.nextInt();
       
        for(int i = 1; i <= n; i++)
        {
        	System.out.println(i+"/"+(i));
            sum = sum +(i/i);
        }
        System.out.println("Sum of series:"+sum);
    }

	}


