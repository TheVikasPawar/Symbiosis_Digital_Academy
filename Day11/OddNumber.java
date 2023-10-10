package Day11;

class OddNumberException extends Exception {
	public OddNumberException(String message) {
		super(message);
	}

	public void checkIfEven(int num) throws OddNumberException {
		if (num % 2 == 1) {
			throw new OddNumberException(num + " is an odd number.");
		} else {
			System.out.println(num + " is even.");
		}
	}

}

public class OddNumber {

	public static void main(String[] args) {
		try {
			OddNumberException ref = new OddNumberException(null);
			ref.checkIfEven(5);

		} catch (OddNumberException e) {
			System.out.println(e.getMessage());
		}
	}

}
