package exception;

public class TaxNotEligibleException extends Exception {
	public TaxNotEligibleException(String m) { // we can use any name in parameter
		super(m);
	}
}
