package Day10;

import java.util.Scanner;
//write a java program to check vowels in a string

public class Vowels {
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String:");
		String str = sc.nextLine();
		sc.close();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' ||
					str.charAt(i) == 'e' ||
					str.charAt(i) == 'i' ||
					str.charAt(i) == 'o' ||
					str.charAt(i) == 'u' ||
					str.charAt(i) == 'A' ||
					str.charAt(i) == 'E' ||
					str.charAt(i) == 'I' ||
					str.charAt(i) == 'O' ||
					str.charAt(i) == 'U') {
				System.out.println("Vowel: "+str.charAt(i));
				count++;
			}

		}
		System.out.println("Number of Vowels in " + str + " is: " + count);
	}
}
