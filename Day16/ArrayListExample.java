package Day16;

import java.util.ArrayList;
//import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//Creating Arraylist of string type
		ArrayList<String> arrList = new ArrayList<>();
		
		arrList.add("Cricket");
		arrList.remove(0);
		arrList.add("Hockey");   
		
		String str=arrList.get(0);
		System.out.println(str);
		
	}
}
