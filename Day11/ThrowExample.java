package Day11;

//Program Statement:

public class ThrowExample {
	static void checkEligibility(int age, int weight) {
		if (age < 12 && weight < 40) {
			throw new ArithmeticException("Student is not Eligible");
		} else {
			System.out.println("Student is Eligible.");
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Registration Process!!");
		ThrowExample.checkEligibility(13,- 4);

	}
}