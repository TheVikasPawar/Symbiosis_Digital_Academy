package Day1;

//Object and Class Example;
//:Initialization through method
class Student4 {
	int rollno;
	String name;

	void insertMethod(int r, String n) {
		rollno = r;
		name = n;
	}

	void displayinformation() {
		System.out.println(rollno + " " + name);
	}
}

public class TestStudent4 {
	public static void main(String[] args) {
		Student4 s1 = new Student4();
		Student4 s2 = new Student4();
		
		s1.insertMethod(1, "Name1");
		s2.insertMethod(2, "Name2");

		s1.displayinformation();
		s2.displayinformation();
	}

}
