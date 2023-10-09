package Day03;
// invoke immediate parent class constructor.

class Animall {
	Animall() {
		System.out.println("Animal is Created.");
	}
}

class Dogg extends Animall {
	Dogg() {
		super(); // Super Keyword
		System.out.println("Dog is Created.");
	}
}

public class TestSuper3 {
	public static void main(String[] args) {
		Dogg ref = new Dogg();

	}

}
