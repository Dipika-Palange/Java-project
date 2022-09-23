package collectionex;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue=new PriorityQueue<String>();
		queue.add("Jasmine");
		queue.offer("Rose");
		queue.offer("Lotus");
		queue.offer("Champa");
		queue.add("Rose");
		
		for (String string : queue) {
			System.out.println(string); 
		}
		
		System.out.println("\n head of queue: "+ queue.element());
		
		System.out.println("\nRemoving element using remove(): "+queue.remove());
		for (String string : queue) {
			System.out.println(string); 
		}
		System.out.println("\nRemoving element using poll(): "+queue.poll());
		for (String string : queue) {
			System.out.println(string); 
		}
	}

}
