package Day16;

class Genericslass <T extends Number>{
	public void display(int a) {
		
		System.out.println("Output: "+a);

	}
}

public class Main1 {
	public static void main(String[] args) {
		Genericslass<Integer> ref = new Genericslass<>();
		ref.display(10);
		
	}

}


