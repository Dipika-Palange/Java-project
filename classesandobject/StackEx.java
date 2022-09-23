package classesandobject;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack=new Stack<String>();
		stack.add("Jasmine");
		stack.push("Rose");
		stack.push("Lotus");
		stack.push("Lilly");
		stack.push("Lotus");
		stack.push(null);
		
		System.out.println(stack);
		
		System.out.println("Removing element"+stack.pop());
		
		System.out.println(stack);
		
		System.out.println("searching element"+stack.search("Rose"));
		System.out.println("searching element"+stack.search("Jaswand"));

	}

}
