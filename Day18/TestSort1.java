package Day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(Integer.valueOf(201));
		al.add(Integer.valueOf(202));
		al.add(230);

		Collections.sort(al);

		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
