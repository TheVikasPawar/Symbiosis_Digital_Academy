package Day19;

public class GarabageCollectionExample {
	public static void main(String[] args) {
		GarabageCollectionExample obj = new GarabageCollectionExample();
		obj = null;

		GarabageCollectionExample a = new GarabageCollectionExample();
		GarabageCollectionExample b = new GarabageCollectionExample();
		b = a;
		System.gc();
	}

	protected void finalize() throws Throwable {
		System.out.println("Garabage Collection Performed by JVM");
		
	}

}
