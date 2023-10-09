package Day05;

// Parameterized Constructor

public class Student4 {
	int id;
	String name;

	Student4(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(name + " " + id);
	}

	public static void main(String[] args) {
		Student4 s1 = new Student4(11, "abc");
		Student4 s2 = new Student4(12, "def");

		s1.display();
		s2.display();
	}
}