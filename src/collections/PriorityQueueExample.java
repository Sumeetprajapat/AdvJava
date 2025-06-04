package collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>(15, new MyComparator());

	}
}
