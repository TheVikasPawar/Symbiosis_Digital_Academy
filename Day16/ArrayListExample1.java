package Day16;

import java.util.ArrayList;

public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<>();

		arrlist.add(15);
		arrlist.add(25);
		arrlist.add(35);
		arrlist.add(45);
		
		System.out.print("Get: ");
		System.out.println(arrlist.get(2));
		
		System.out.println("ArrayList Elements: ");

		for (Integer integer : arrlist) {
			System.out.println(integer);
		}

	}

}