package Day07;


interface TestInterface {
	void draw();
}

class Rectangle implements TestInterface {
	public void draw() {
		System.out.println("drawing rectangle.");
	}
}

class Circle implements TestInterface {
	public void draw() {
		System.out.println("drawing circle");
	}
}

public class TestInterface1 {
	public static void main(String[] args) {
		TestInterface d = new Circle();
		d.draw();
	}
}