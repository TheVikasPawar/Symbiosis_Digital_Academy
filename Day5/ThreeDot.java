package Day5;

class ThreeDot1 {
	void show(int... values) {
		for (int b : values) {
			System.out.println(b);
		}
	}

	void show(double... a) {
		for (double d : a) {
			System.out.println(d);
		}
	}
}
public class ThreeDot {
		public static void main(String[] args) {
			ThreeDot1 td = new ThreeDot1();
			td.show(12.32 );
		}
	}

