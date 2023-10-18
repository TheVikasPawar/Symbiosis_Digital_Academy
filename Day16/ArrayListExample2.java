package Day16;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample2 {
	public static void main(String[] args) {
	ArrayList<String> Country = new ArrayList<>();
	
	Country.add("India");
	Country.add("US");
	Country.add("UK");
	Country.add("China");
	Country.add("Denmark");
	
	System.out.println(Country);// unsorted List
	
	Collections.sort(Country); 
	System.out.println(Country);    //Sort
	
	
	Collections.reverse(Country);   //Reverse Order
	System.out.println(Country);
	

	}

}
