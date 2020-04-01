@SuppressWarnings("serial")
public class InvalidSubspeciesException extends Exception {
	public InvalidSubspeciesException() {
		super("Invalid Subspecies. Can only be Alaskan, Asiatic, European, Grizzly, Kodiak, or Siberian.");
	}
	
	public InvalidSubspeciesException(String message) {
		super(message);
	}
}
