@SuppressWarnings("serial")
public class InvalidSimIDException extends Exception {
	public InvalidSimIDException() {
		super("Invalid simID. It should be greater than zero.");
	}
	
	public InvalidSimIDException(String message) {
		super(message);
	}
}