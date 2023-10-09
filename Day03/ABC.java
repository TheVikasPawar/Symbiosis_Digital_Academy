package Day03;

//Final Method
class XYZ {
	final void demo() {
		System.out.println("XYZ Class Method.");
	}
}

public class ABC extends XYZ {
	/*
	 * //void demo() { System.out.println("ABC class Method."); }
	 */

	public static void main(String[] args) {
		ABC obj = new ABC();
		obj.demo();
	}

}
