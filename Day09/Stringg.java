package Day09;

public class Stringg {
	public static void main(String[] args) {
		String str = "Welcome to GmailAccess.com";

		// Finding length of the string using length() method.
		int len = str.length();


		//charAt() Method
		// First Character
		System.out.println("First Character: " + str.charAt(0));
		// Last Character
		System.out.println("Last Character: " + str.charAt(len - 1));


		// Equals() Method
		String str1 = new String("Welcome to GmailAccess.com");

		if (str.equals(str1)) {
			System.out.println("String str and str1 are equal.");
		} else {
			System.out.println("String str and str1 are not equal.");
		}
		
		
		//concat() method
		System.out.println(str.concat(" + ").concat(str1));
		
		
		//substring() Method
		//startIndex
		System.out.println(str.substring(5));
		//startIndex,endIndex
		System.out.println(str.substring(3, 14));
		
		// Around 46 methods	
	}

}
