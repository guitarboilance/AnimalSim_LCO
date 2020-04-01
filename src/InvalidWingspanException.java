@SuppressWarnings("serial")
public class InvalidWingspanException extends Exception {
	public InvalidWingspanException() {
		super("Invalid wingSpan. It should be between 5.0cm and 11.0cm.");
	}
		
	public InvalidWingspanException(String message) {
		super(message);
	}
}