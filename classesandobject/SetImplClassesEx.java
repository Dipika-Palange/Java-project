package classesandobject;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplClassesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> hset=new HashSet<String>();
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Guava");
		hset.add("Banana");
		hset.add("Apple");
		hset.add(null);
		
		System.out.println("Implementing HashSet: ");
		for (String string : hset) {
			System.out.println(string);
		}
		
		LinkedHashSet<String> linkedhashset=new LinkedHashSet<String>();
		linkedhashset.add("Pizza");
		linkedhashset.add("Coffee");
		linkedhashset.add("Biryani");
		linkedhashset.add("Burger");
		linkedhashset.add("Pizza");
		linkedhashset.add(null);
		
		System.out.println("Implementing LinkedHashSet: ");
		for (String string : linkedhashset) {
			System.out.println(string);
		}
		
		
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("Rose");
		tset.add("Lotus");
		tset.add("Lilly");
		
		System.out.println("Implementing TreeSet: ");
		
		for (String string : tset) {
			System.out.println(string);
		}
	}

}
