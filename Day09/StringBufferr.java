package Day09;

public class StringBufferr {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");

		// append() Method
		sb.append("Java");
		System.out.println(sb);

		// Insert() Method
		sb.insert(3, "Java");
		System.out.println(sb);

		// replace() method
		sb.replace(3, 7, "");
		System.out.println(sb);

		// delete() method
		sb.delete(5, 10);
		System.out.println(sb);

		// reverse() method
		sb.reverse();
		System.out.println(sb);
	}
}
