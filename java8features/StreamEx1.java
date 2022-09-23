package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=Arrays.asList("Dipika","Shubham","Swapnali","Raj","Shiv","Bhaghyashree");
	// creating stream class
		
	Stream<String> allNames=names.stream();
	
	//performing intermediate operation length>7
	
	Stream<String> longNames=allNames.filter(str->str.length()>7);
	
	//perform terminal operation print longNames
	
	longNames.forEach(str->System.out.println(str));
	}

}
