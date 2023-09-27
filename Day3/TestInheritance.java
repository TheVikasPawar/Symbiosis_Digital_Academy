package Day3;
// MultiLevel Inheritance
class Animal2 {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog2 extends Animal2 {
	void bark() {
		System.out.println("Barking...");
	}
}

class BabyDog extends Dog2 {
	void weep() {
		System.out.println("Weeping...");
	}

}

public class TestInheritance {
	public static void main(String[] args) {
		BabyDog ref = new BabyDog();
		ref.eat();
		ref.bark();
		ref.weep();
	}
}
