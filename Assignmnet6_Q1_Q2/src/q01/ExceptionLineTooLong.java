package q01;

public class ExceptionLineTooLong extends Exception {
	@Override
	public String getMessage() {
		return "The string is too long";
	}
}
