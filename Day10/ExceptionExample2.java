package Day10;

public class ExceptionExample2 {
	public static void main(String[] args) {
		try {
			int a[] = new int[7];
			a[6] = 30/0;
			System.out.println("Print Statement.");
		}

		catch (ArithmeticException e) {
			System.out.println("Warning: Arithmetic Exception.");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: ArrayIndexOutOfBoundsException.");
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Program is over");
		}
	}

}
