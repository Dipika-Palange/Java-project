package basic;

import java.util.Scanner;

public class SwitchAlphabate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Albhabate :");
		choice =sc.next().charAt(0);
		switch(choice)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("ALbhabate is vowel");
			break;
			default:
				System.out.println("Albhabate is consonant");
		}

	}

}
