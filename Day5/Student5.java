package Day5;

import Day2.Display1;

// Java Program to Overload Constructor.

public class Student5 {
	int id;
	String name;
	int age;

	Student5(int i, String n) {
		id = i;
		name = n;
	}

	Student5(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String[] args) {
		Student5 S1 = new Student5(1, "abc");
		Student5 S2 = new Student5(1, "def", 21);

		S1.display();
		S2.display();
	}

}
