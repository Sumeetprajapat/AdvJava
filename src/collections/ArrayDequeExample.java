package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<>();
		dq.add("Glenn");
		dq.add("Negan");
		dq.addLast("Maggie");
		dq.addFirst("Rick");
		dq.add("Daryl");
		System.out.println(dq);
		System.out.println("Remove: " + dq.remove());
		System.out.println(dq);
		System.out.println("Remove First: " + dq.removeFirst());
		System.out.println(dq);
		System.out.println("Remove Last: " + dq.removeLast());
		System.out.println(dq);
		System.out.println("Head Element: " + dq.element());
		System.out.println(dq);
		System.out.println("Poll Element " + dq.poll());
		System.out.println(dq);
		System.out.println("Poll First: " + dq.pollFirst());
		System.out.println(dq);
		System.out.println("Poll Last: " + dq.pollLast());
		System.out.println(dq);
		System.out.println("Peek Method: " + dq.peek());
		System.out.println(dq);
		System.out.println("Peek First: " + dq.peekFirst());
		System.out.println(dq);
		System.out.println("Peek Last: " + dq.peekLast());
		System.out.println(dq);

	}
}
