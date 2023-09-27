package Day5;

public class ThreeDotsJava {
	static void display(String... values) {
		for (String s : values) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		display();
		display("hello");
		display("ABC " + "DEF " + "GHI");
	}
}
