package collectionex;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String>deque=new ArrayDeque<String>();
		deque.add("Coffee");
		deque.offer("Tea");
		deque.offer("Ice-Cream");
		deque.offer("Cold-Drink");
		deque.offer("Tea");
		deque.offerLast("Sandwitch");
		deque.offerFirst("Pizza");
		
		for (String string : deque) {
			System.out.println(string);
		}
		
		System.out.println("\nremoving  first element");
		deque.pollFirst();
		for (String string : deque) {
			System.out.println(string);
		}
		
		System.out.println("\n removing  last element");
		deque.pollLast();
		for (String string : deque) {
			System.out.println(string);
		}
		
	}

}
