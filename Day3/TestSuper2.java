package Day3;

class Animal1 {
	void eat() {
		System.out.println("Animal is Eating...");
	}
}

class Dog1 extends Animal1 {
	void eat() {
		System.out.println("Dog is Eating...");
	}

	void bark() {
		System.out.println("Barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}

public class TestSuper2 {
	public static void main(String[] args) {
		Dog1 ref = new Dog1();
		ref.work();
	}

}