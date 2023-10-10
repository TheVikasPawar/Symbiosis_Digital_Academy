package Day11;

import java.io.IOException;

public class ThrowsExample {
	public void myMethod(int num) throws IOException, ClassNotFoundException {
		if (num == 1) {
			throw new IOException("IOException Occured!!");
		} else {
			throw new ClassNotFoundException("ClassNotFound Occured!!");
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		ThrowsExample ref = new ThrowsExample();
		ref.myMethod(1);
	}
}
