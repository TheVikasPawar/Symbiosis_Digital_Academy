package Day11;

class MyException extends Exception {
	String str1;

	public void Example(String str2) {
		str1 = str2;
	}

	public String tostring() {
		return ("My Exception Occured" + str1);

	}
}

public class Example {
	public static void main(String[] args) {
		try {
			System.out.println("Starting try Block.");
			System.out.println("This is My Error Msg.");

		} catch (Exception e) {
			System.out.println("Catch Block");
			System.out.println(e);
		}
	}
}
