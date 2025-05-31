package operators;

import java.util.*;
public class Grade {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total No of Marks out of 600: ");
		int total = sc.nextInt();
		double avg = total/6.0;
		if(avg >= 90 && avg <=100) {
			System.out.println("Grade A");
		}else if (avg >= 70 && avg <= 90){
			System.out.println("Grade B");
		}else if (avg >= 50 && avg <=70) {
			System.out.println("Grade C");
		}else if(avg >= 35 && avg <= 50 ) {
			System.out.println("Grade D");
		}else{
			System.out.println("Fail");
		}
		System.out.printf("Total marks you got %d out of 600\n",total);
		System.out.println("Average "+avg);
	}
}
