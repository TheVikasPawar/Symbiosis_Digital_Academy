package Day02;

abstract class Demo {
	abstract void Display();
}



public class MyClass extends Demo {

	void Display() {
		System.out.println("Abstract Method");
	}

	public static void main(String[] args) {
		Demo ref = new MyClass();
		ref.Display();
	}
}
