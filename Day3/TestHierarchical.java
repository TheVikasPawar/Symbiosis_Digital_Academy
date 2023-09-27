package Day3;

// Hierarchical Inheritance
class Animal3 {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog3 extends Animal3 {
	void bark() {
		System.out.println("Barking...");
	}
}

class Cat3 extends Animal3 {
	void meow() {
		System.out.println("Meowing...");
	}
}

public class TestHierarchical {
	public static void main(String[] args) {
		Cat3 ref = new Cat3();
		ref.eat();
		ref.meow();
	}
}