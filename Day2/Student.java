package Day2;

// Define a class named Studentinfo
class Studentinfo {
	// Private instance variables for roll and name
	private int roll;
	private String name;

	// Getter method for roll
	public int getroll() {
		return roll;
	}

	// Setter method for roll
	public void setRoll(int roll) {
		this.roll = roll;
	}

	// Getter method for name
	public String getname() {
		return name;
	}

	// Setter method for name
	public void setName(String name) {
		this.name = name;
	}

	// Method to display student information
	public void display(int roll, String name) {
		System.out.println("Roll No.: " + roll);
		System.out.println("Name: " + name);
	}
}

// Main class named Student
public class Student {
	public static void main(String[] args) {
		// Create an instance of Studentinfo class
		Studentinfo ref = new Studentinfo();

		// Calling getroll() method, but the return value is not used or printed
		ref.getroll();

		// Calling setRoll() method to set the roll number to 34
		ref.setRoll(34);

		// Calling getname() method, but the return value is not used or printed
		ref.getname();

		// Calling setName() method to set the name to "Vikas"
		ref.setName("Vikas");
		
		// Calling display() method with different roll number and name values
		ref.display(23, "VIkas"); // Note: You are passing "23" and "VIkas" here, not the values you previously set

	}
}
