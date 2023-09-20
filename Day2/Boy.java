package Day2;

class Human {
	public void eat() {
		System.out.println("Human is Eating");
	}
}

public class Boy extends Human {
	@Override
	public void eat() {
		System.out.println("Boy is Eating");
	}

	public static void main(String[] args) {

		Human ref = new Human();
		ref.eat();
	}
}