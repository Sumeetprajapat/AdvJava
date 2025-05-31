package operators;
import java.util.*;

public class Assignmentoperator {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter No 1: ");
		int a = sc.nextInt();
		System.out.print("ENter No 2: ");
		int b = sc.nextInt();
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Division: "+(a/b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Modulous: "+(a%b));
		sc.close();		
	}
}
