package Day16;

import java.util.ArrayList;

public class ArrayListExample3 {
	public static void main(String[] args) {

		ArrayList<String> lang = new ArrayList<>();
		lang.add("Marathi");
		lang.add("English");
		lang.add("Hindi");
		lang.add("Tamil");
		lang.add("Kannada");

		System.out.println("Lang: " + lang);

		ArrayList<String> programming = new ArrayList<>();
		programming.addAll(lang);
		int a = programming.size();
		System.out.println(a);
		System.out.println("programming: " + programming);
	}

}
