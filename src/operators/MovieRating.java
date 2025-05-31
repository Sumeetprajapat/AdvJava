package operators;

import java.util.*;
public class MovieRating {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rating out of 5: ");
		double rating = sc.nextDouble();
		
		if(rating >=4.0 && rating <= 5.0) {
			System.out.println("Good");
		}else if(rating >=3.0 && rating <= 4.0) {
			System.out.println("Average");
		}else if(rating <= 3.0) {
			System.out.println("Bad");
		}else {
			System.out.println("Invalid rating");
		}
	}
}
