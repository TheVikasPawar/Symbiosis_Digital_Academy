package Day17;

import java.util.Iterator;
import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("item1");
		vector.add("item2");
		vector.add("item3");
		vector.add("item4");

		vector.remove("item3");

		Iterator<String> it = vector.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
