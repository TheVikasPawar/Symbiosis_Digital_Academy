package Day11;

class vowelsContainException extends Exception {
	public vowelsContainException(String string) {
		super(string);
	}

	public void checkVowels(String str) throws vowelsContainException{
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' && str.charAt(i) == 'e' && str.charAt(i) == 'i' && str.charAt(i) == 'o'
					&& str.charAt(i) == 'u') {
				System.out.println("1");
				// throw new vowelsContainException("Yes");
			} else {
				throw new vowelsContainException("Does not contain vowels");
			}
		}
	}
}

public class Vowels {
	public static void main(String[] args) {
		vowelsContainException ref = new vowelsContainException(null);
		try {
			ref.checkVowels("Pranav");
		} catch (vowelsContainException e) {
			
			e.printStackTrace();
		}
	}

}
