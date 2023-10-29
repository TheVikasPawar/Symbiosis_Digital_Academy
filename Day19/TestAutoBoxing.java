package Day19;

import java.util.ArrayList;
import java.util.Iterator;

public class TestAutoBoxing {
	public static void myMethod(Integer num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		Integer inum = 3;
		Long lnum = 32L;
		myMethod(2);

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(54);
		al.add(54);
		al.add(54);
		
	
		Iterator iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");

		}
	}

}
