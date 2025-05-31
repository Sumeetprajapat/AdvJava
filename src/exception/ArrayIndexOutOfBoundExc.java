package exception;

public class ArrayIndexOutOfBoundExc {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40 };

		try {
			for (int i = 0; i < numbers.length; i++) {
				System.out.println("Element at index " + i + ": " + numbers[i]);
			}
			System.out.println("Accessing index : " + numbers.length + numbers[numbers.length]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Index out of bounds");
		}
	}
}
