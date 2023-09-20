package Day2;
//Create an Instance Method
public class InstanceMethodExample {

	public static void main(String[] args) {
		InstanceMethodExample obj = new InstanceMethodExample();
		System.out.println("The Sum is: " + obj.add(12, 10));
	}

	int s;

	public int add(int a, int b) {
		s = a + b;
		return s;

	}

}
