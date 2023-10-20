package Day17;

import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		stack.push("chaitanya");
		stack.push("Ajeet");
		stack.push("Hari");
		stack.push("Steve");
		stack.pop();
		stack.push("Carl");

		for (String string : stack) {
			System.out.println(string);
		}

	}

}
