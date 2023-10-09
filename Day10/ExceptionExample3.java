package Day10;

public class ExceptionExample3 {
	public static void main(String[] args) {
		System.out.println(ExceptionExample3.myMethod());
	}
	public static int myMethod() {
		try {
			return 112;
		} finally {
			System.out.println("This is Finally Block.");
			System.out.println("Finally block run even return statement.");
		}
		
	}

}

//The Statements present in the finally block execute even
//if the try block contains control transfer statements like
//return,break or continue
