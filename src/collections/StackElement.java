package collections;

import java.util.Stack;

public class StackElement {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(23);
		stack.push(33);
		stack.push(43);
		stack.push(53);
		stack.push(63);
		stack.push(73);
		stack.push(83);
		stack.push(93);
		stack.push(33);
		System.out.println(stack);
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("After Remove: " + stack);

	}
}
