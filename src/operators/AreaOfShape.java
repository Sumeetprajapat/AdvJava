package operators;

import java.util.Scanner;

public class AreaOfShape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l, b;
		System.out.println("1. Area of Square\n2. Area of Circle\n3.Area of Rectangle");
		char ch;
		System.out.println("Enter your choice: ");
		ch = sc.next().charAt(0);// input character in scanner
		switch (ch) {
		case '1':
			System.out.println("Enter the side: ");
			l = sc.nextInt();
			double area = l * l;
			System.out.println("Area of a square is: " + area);
			break;
		case '2':
			System.out.println("Enter the radius: ");
			l = sc.nextInt();
			double area1 = 3.14 * l * l;
			System.out.println("Area of a circle is: " + area1);
			break;
		case '3':
			System.out.println("Enter the length: ");
			l = sc.nextInt();
			System.out.println("Enter the breadth: ");
			b = sc.nextInt();
			double area2 = l * b;
			System.out.println("Area of rectangle is: " + area2);
			break;
		default:
			System.out.println("invalid choice(enter between 1 to 3)only");
			sc.close();

		}

	}
}
