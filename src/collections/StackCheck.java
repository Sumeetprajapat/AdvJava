package collections;

import java.util.Stack;

public class StackCheck {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		boolean result = st.isEmpty();
		System.out.println("Is Empty: " + result);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println("Element in stack: " + st);
		result = st.empty();
		System.out.println("Is Empty: " + result);
	}
}
