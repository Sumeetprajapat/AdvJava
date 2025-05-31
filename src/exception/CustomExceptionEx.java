package exception;

public class CustomExceptionEx {
	// Driver Program
	static void checkAge(int age) throws AgeValidation {
		if (age < 18) {
			throw new AgeValidation("Age is not valid");
		} else {
			System.out.println("age is valid");
		}
	}

	public static void main(String args[]) {
		try {
			checkAge(19);
		} catch (AgeValidation ex) {
			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
	}
}
