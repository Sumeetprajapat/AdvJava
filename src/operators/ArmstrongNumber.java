package operators;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int lang = 0;

		while (temp != 0) {
			temp = temp / 10;
			lang++;
		}
		int temp2 = num;
		int arm = 0;
		while (temp2 != 0) {
			int mul = 1;
			int rem = temp2 % 10;
			for (int i = 1; i <= lang; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			temp2 = temp2 / 10;
		}
		if (arm == num) {
			System.out.println("ARM");
		} else {
			System.out.println("Not");
		}
		System.out.println(num);
		System.out.println(arm);
		System.out.println(temp);
		System.out.println(temp2);
	}
}
