package Day11;

class InvalidProductionException extends Exception {
	

	public InvalidProductionException(String string) {
		super(string);
		
	}

	void productCheck(int weight) throws InvalidProductionException {
		if (weight < 100) {
			throw new InvalidProductionException("Product Invalid");

		}
	}
}

public class Example2 {
	public static void main(String[] args) {
		InvalidProductionException ref = new InvalidProductionException(null);
		try {
			ref.productCheck(60);
		} catch (InvalidProductionException e) {
			System.out.println("caught");
			System.out.println(e.getMessage());
		}

	}
}
