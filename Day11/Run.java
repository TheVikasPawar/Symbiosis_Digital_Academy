package Day11;

class OddNumber extends Exception {
	public OddNumber(String string) {
		super(string);
	}

	void checkodd(int num) throws OddNumber {
		if (num % 2 == 0) {
			throw new OddNumber(num + "is a odd number.");
		} else {
			System.out.println(num + "is a even number.");
		}
	}
}

public class Run {
	public static void main(String[] args) throws OddNumber {
		OddNumber ref = new OddNumber(null);
		ref.checkodd(32);
	}

}
