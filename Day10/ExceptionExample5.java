package Day10;
// Number Format Exception
public class ExceptionExample5 {
	public static void main(String[] args) {
		String inputString = "Vikas";
		try {
			int a = Integer.parseInt(inputString);
			
		} catch (NumberFormatException ex) {
			System.out.println("Invalid string in argumment");
		}
	}

}
