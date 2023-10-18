package Day16;

import java.util.Iterator;
import java.util.LinkedList;

public class LL1 {
	public static void main(String[] args) {
		LinkedList<String> Linklist = new LinkedList<>();

		Linklist.add("Mumbai");
		Linklist.add("Pune");
		Linklist.add("Delhi");
		Linklist.add("Chennai");
		Linklist.addFirst("Hydrabad");
		Linklist.addLast("Kolkata");
		
		Iterator<String> it = Linklist.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}

	}
}
