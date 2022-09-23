package collectionex;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<String> list=new ArrayList<String>();
  list.add("Raj");
  list.add("Siddhi");
  list.add(0,"Reema");
  list.add("Ravi");
  list.add("Ravi");
  ListIterator<String> itr= list.listIterator();
  System.out.println("iterating in forward direction");
  while(itr.hasNext())
  {
	  System.out.println(itr.next());
	  
  }
  System.out.println("\n iterating in backrward direction");
  while(itr.hasPrevious())
  {
	  System.out.println(itr.previous());
  }
	}

}
