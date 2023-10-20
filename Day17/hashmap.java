package Day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		
		
		//Key and Value Pairs
		
		hmap.put(101, "chaitanya");
		hmap.put(102, "Deric");
		hmap.put(103, "Logan");
		hmap.put(104, "Eric");
		hmap.put(105, "Paul");
		
		//print HashMap Elements
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry m = (Map.Entry)iterator.next();
			System.out.print("key is: "+m.getKey()+" & Value is: ");
			System.out.println(m.getValue());
			
		}
	}
}
