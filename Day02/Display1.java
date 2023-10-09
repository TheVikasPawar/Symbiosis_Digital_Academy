package Day02;
//Static Method

public class Display1 {
	public void show() {

		System.out.println("It is an example of staic method.");
	}

	public static void main(String[] args) {
		// call static method
		Display1 ref = new Display1();
		ref.show();
	}

}
