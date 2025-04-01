package q02;

public class NegativeDiameterException extends Exception {
	@Override
	public String getMessage() {
		return "NegativeDiameterException : The diameter is negative";
	}
}
