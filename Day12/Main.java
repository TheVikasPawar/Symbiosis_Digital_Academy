package Day12;



public class Main {

	public static void main(String args[]) {
		String str = new String("Vikas");
		char c;

		try {

			System.out.println(str.charAt(10));

		} catch (Exception ex) {

			System.out.println(ex.getMessage());
		}
	}
}
