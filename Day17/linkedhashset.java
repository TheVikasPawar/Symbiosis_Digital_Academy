package Day17;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class linkedhashset {
	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet<>();

		set.add("Paul");
		set.add("Ram");
		set.add("Aaron");
		set.add("Leo");
		set.add("Becky");

		TreeSet<String> tree = new TreeSet<>();

		tree.add("Paul");
		tree.add("Ram");
		tree.add("Aaron");
		tree.add("Leo");
		tree.add("Becky");

		for (String str : set) {
			System.out.println(str);
		}
		System.out.println();
		for (String str1 : tree) {
			System.out.println(str1);
		}

	}

}
