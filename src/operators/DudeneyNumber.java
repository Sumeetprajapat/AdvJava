package operators;

import java.util.Scanner;

public class DudeneyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int lang = 0;

		while (num != 0) {
			temp = temp / 10;
			lang++;
		}
		sc.close();
	}
}
