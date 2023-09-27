package Day3;

class Animal {
	String color = "White";
}

public class Dog extends Animal {
	String color = "Black";

	void printColor() {
		// print color of dog class
		System.out.println(color);

		// print color of animal class
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		Dog ref = new Dog();
		ref.printColor();
	}
}