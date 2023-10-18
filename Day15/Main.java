package Day15;

public class Main {
	public static void main(String[] args) {

		GenericsClass<Integer> intObj = new GenericsClass<>(5);
		System.out.println("Generic Class Returns: " + intObj.getData());

		GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
		System.out.println("Generics Class Returns: " + stringObj.getData());
	}
}

class GenericsClass<T> {
	private T data;

	public GenericsClass(T data) {
		this.data = data;
	}

	public T getData() {
		return this.data;
	}
}

//Java Generics Method
/*
 * similar to the generics class, we can also create a method that
 * can be used with any type of data, called generics method.
 */


