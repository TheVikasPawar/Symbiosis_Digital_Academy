package Day19;

import java.util.ArrayList;

public class TestUnboxing {
	
	public static void myMethod(Integer num) {
		System.out.println(num);
	}
	public static void main(String[] args) {
		
		myMethod(20);	//Case 1
		
		//Case 2
		Integer i = new Integer(50);
		int a = i;
		System.out.println(a);
		
		ArrayList al = new ArrayList();
		al.add(25);
		int num = (int) al.get(0);
		System.out.println(num);
		
	}

}
