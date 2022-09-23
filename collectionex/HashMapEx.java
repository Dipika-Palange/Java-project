package collectionex;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map=new HashMap<String,String>();
		map.put("Br", "Brazil");
		map.put("In", "India");
		map.put("de", "Germany");
		
		System.out.println("\n implementing HashMap");
		
		for(Map.Entry<String, String> entry:map.entrySet())
		{
			System.out.println("Country code: "+entry.getKey()+"Country Name: "+entry.getValue());
		}
		System.out.println("\n"+map.get("In"));
		
		TreeMap<String,String> treemap = new TreeMap<String,String>();
		treemap.put("B10", "Sandwitch");
		treemap.put("D5", "Pav-bhaji");
		treemap.put("L15", "Chole-puri");
		treemap.put("B20", "Coffee");

		System.out.println("\n implementing TreeMap");
		for(Map.Entry<String, String> entry:map.entrySet())
		{
			System.out.println("Country code: "+entry.getKey()+"Country Name: "+entry.getValue());
		}
		
		
		Hashtable<String,String> hashtable=new Hashtable<String,String>();
		hashtable.put("B10", "Sandwitch");
		hashtable.put("D5", "Pav-bhaji");
		hashtable.put("L15", "Chole-puri");
		hashtable.put("B20", "Coffee");
		
		
		System.out.println("\n implementing Hashtable");
		for(Map.Entry<String, String> entry:map.entrySet())
		{
			System.out.println("Country code: "+entry.getKey()+"Country Name: "+entry.getValue());
		}
	}

}
 