package Day03;

//Changing data type of arguments
class Adderr {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}
}

public class TestOverloading2 {
	public static void main(String[] args) {
		System.out.println(Adderr.add(23, 450));
		System.out.println(Adderr.add(23.4, 45.6));
	}
}
