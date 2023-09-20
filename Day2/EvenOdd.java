package Day2;

//import scanner class
import java.util.Scanner;

//create class EvenOdd
public class EvenOdd {

	public static void main(String[] args) {

		//Creating Scanner class object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		// reading value from user
		
		int num = scan.nextInt();

		//method calling
		findEvenOdd(num);
		//to remove warning
		scan.close();
	}

	public static void findEvenOdd(int num) {
		if (num % 2 == 0)
			System.out.println(num + " is even.");
		else
			System.out.println(num + " is odd");
	}

}
