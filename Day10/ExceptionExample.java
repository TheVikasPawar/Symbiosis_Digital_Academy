package Day10;

public class ExceptionExample {
	public static void main(String[] args) {
		int num1, num2;
		try {
			
			num1 = 0;
			num2 = 62 / num1;
			System.out.println(num2);
			
			
			int arr[]=new int[3];
			arr[8]= 1;
			
			
		} 
		
		
		catch (ArithmeticException e) {
			System.out.println("Divided by zero.");
			
		} 
		
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
