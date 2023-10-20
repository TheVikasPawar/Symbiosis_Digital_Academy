package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//LinkedList to ArrayList
public class ConvertExample {
	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Harray");
		linkedlist.add("Jack");
		linkedlist.add("Tim");
		linkedlist.add("Rick");
		linkedlist.add("Rock");

		List<String> list = new ArrayList<String>(linkedlist);

		for (String string : list) {
			System.out.println(string);
		}
	}

}
