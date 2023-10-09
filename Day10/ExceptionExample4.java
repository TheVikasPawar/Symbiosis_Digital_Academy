package Day10;

public class ExceptionExample4 {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str+" "+str);
			//System.out.println(str.length());

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

}
