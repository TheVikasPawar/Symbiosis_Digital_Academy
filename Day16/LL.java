package Day16;

import java.util.Iterator;
import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		LinkedList<String> Linklist = new LinkedList<>();

		Linklist.add("Mumbai");
		Linklist.add("Pune");
		Linklist.add("Delhi");
		Linklist.add("Chennai");

		System.out.println("LinkedLIst Elements by Iterator loop: ");

		Iterator<String> it = Linklist.descendingIterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("________________________________");
		System.out.println("LinkedLIst Elements by for loop: ");

		for (int i = 0; i < Linklist.size(); i++) {
			System.out.println(Linklist.get(i));
		}

		System.out.println("________________________________");
		System.out.println("LinkedLIst Elements by for each loop: ");
		for (String string : Linklist) {
			System.out.println(string);
		}

		System.out.println("________________________________");
		System.out.println("LinkedLIst Elements by for while loop: ");
		int i = 0;
		while (Linklist.size() > i) {
			System.out.println(Linklist.get(i));
			i++;
		}

	}

}
