package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.add("Rick");
		q.add("Maggie");
		q.add("Glenn");
		q.add("Negan");
		q.add("Daryl");
		System.out.println(q);
		System.out.println("Remove Eement: " + q.remove());
		System.out.println(q);
		System.out.println("Head Element: " + q.element());
		System.out.println(q);
		System.out.println("Poll Method: " + q.poll());
		System.out.println(q);
		System.out.println("Peek method: " + q.peek());
		System.out.println(q);
	}
}
