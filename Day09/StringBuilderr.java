package Day09;

public class StringBuilderr {
	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("Hello ");
	
	sb.append("Java");
	System.out.println(sb);
	
	sb.insert(5, "Java");
	System.out.println(sb);
	
	sb.replace(10, 15, "");
	System.out.println(sb);
	
	sb.reverse();
	System.out.println(sb);
	
	sb.delete(10, 11);
	System.out.println(sb);
	}
	

}
