package Day17;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("Paul");
		hashSet.add("Ram");
		hashSet.add("Aaron");
		hashSet.add("Leo");
		hashSet.add("Becky");

		HashSet<Integer> set = new HashSet<Integer>();

		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);

		System.out.println("String: ");
		Iterator<String> it = hashSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		System.out.println();
		System.out.println("Integer: ");
		for (Integer integer : set) {
			System.out.println(integer);

		}
		// Hashset does not maintain insertion order.
		// Linkedhashset maintain insertion order.
	}

}
