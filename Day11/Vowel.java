package Day11;
class VowelsContainException extends Exception {
    public VowelsContainException(String message) {
        super(message);
    }

    public void checkVowels(String str) throws VowelsContainException {
        boolean containsVowels = false;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                containsVowels = true;
                break; // Exit the loop if a vowel is found
            }
        }
}

public class Vowel {
    public static void main(String[] args) {
        VowelsContainException ref = new VowelsContainException(null);
        try {
            ref.checkVowels("Pranav");
        } catch (VowelsContainException e) {
            e.printStackTrace();
        }
    

        if (!containsVowels) {
            throw new VowelsContainException("Does not contain vowels");
        } else {
            System.out.println("Contains vowels");
        }
    }
}
}
