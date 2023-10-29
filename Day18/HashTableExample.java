package Day18;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {
	public static void main(String[] args) {
		Enumeration names;
		String key;
		Hashtable<String, String> hashtable = new Hashtable<>();
		
		hashtable.put("Key 1","Chaitanya");
		hashtable.put("Key 2","Ajeet");
		hashtable.put("Key 3","Peter");
		hashtable.put("Key 4","Ricky");
		hashtable.put("Key 5","Mona");
		
		names = hashtable.keys();
		
		while (names.hasMoreElements()) {
			key = (String) names.nextElement();
			System.out.println("Key: "+key+" & Value: "+ hashtable.get(key));
			
		}
	}

}
