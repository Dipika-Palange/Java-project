package collectionex;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list= new LinkedList<String>();
		list.add("Raj");
		list.add("Siddhi");
		 list.add("Reema");
		  list.add("Ravi");
		  list.add("Ravi");
		  
		  ListIterator<String> itr=list.listIterator();
		  while(itr.hasNext())
		  {
			  System.out.println(itr.next());
		  }
		System.out.println("\nusing for each method");
		  for (String string : list) {
			System.out.println(string);
		}
		  
		
	}

}
