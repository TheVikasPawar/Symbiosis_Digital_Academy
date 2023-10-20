package Day17;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class linkedhashmap {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hmap = new LinkedHashMap<>();

		// Key and Pairs
		hmap.put(101, "chaitanya");
		hmap.put(102, "Deric");
		hmap.put(103, "Logan");
		hmap.put(104, "Eric");
		hmap.put(105, "Paul");

		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry m = (Map.Entry) iterator.next();
			System.out.print("key is: " + m.getKey() + " & Value is: ");
			System.out.println(m.getValue());

		}
	}

}
