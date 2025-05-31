package exception;

public class EmployeeNameInvalidException extends Exception {
	public EmployeeNameInvalidException(String m) { // we can use any name in parameter
		super(m);
	}
}
