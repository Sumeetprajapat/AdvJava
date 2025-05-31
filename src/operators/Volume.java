package operators;

import java.util.Scanner;

public class Volume {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l, b, h;
		System.out.println("1. Volume of cube\n2. Volume of Sphere\n3. Volume of cuboid");
		char ch;
		System.out.println("Enter your choice: ");
		ch = sc.next().charAt(0);// input character in scanner
		switch (ch) {
		case '1':
			System.out.println("Enter the side: ");
			l = sc.nextInt();
			double area = l * l * l;
			System.out.println("Volume of cube is: " + area);
			break;
		case '2':
			System.out.println("Enter the radius: ");
			l = sc.nextInt();
			double area1 = (4.0 / 3) * Math.PI * l * l * l;
			System.out.println("Volume of Sphere: " + area1);
			break;
		case '3':
			System.out.println("Enter the length: ");
			l = sc.nextInt();
			System.out.println("Enter the breadth: ");
			b = sc.nextInt();
			System.out.println("Enter the height: ");
			h = sc.nextInt();
			double area2 = l * b * h;
			System.out.println("Volume of cuboid: " + area2);
			break;
		default:
			System.out.println("invalid choice(enter between 1 to 3)only");

		}

	}
}
