
@SuppressWarnings("serial")
public class InvalidCoordinateException extends Exception {
	public InvalidCoordinateException() {
		super("Invalid Coordinates. It should be 0 or greater");
	}
	
	public InvalidCoordinateException(String message) {
		super(message);
	}
}
