package Day01;

class Employee {
	int id;
	String name;
	float salary;

	void insert(int i, String n, float s) {
		id = i;
		name = n;
		salary = s;
	}

	void displayinformation() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class TestEmployee {
	public static void main(String[] args) {

		Employee E1 = new Employee();
		Employee E2 = new Employee();
		Employee E3 = new Employee();

		E1.insert(1, "Ajit", 25000);
		E2.insert(2, "Irfan", 25678);
		E3.insert(3, "nakul", 28469);

		E1.displayinformation();
		E2.displayinformation();
		E3.displayinformation();

	}

}
