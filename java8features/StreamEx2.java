package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=Arrays.asList("Dipika","Shubham","Swapnali","Raj","Shiv","Bhaghyashree");
		
		List<String> longNames=names.stream().filter(str->str.length()>6 && str.length()<11).collect(Collectors.toList());
		longNames.forEach(str->System.out.println(str));
		
		longNames.forEach(System.out::println);// for method reference 
	}

}
