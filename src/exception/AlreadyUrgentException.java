package exception;

public class AlreadyUrgentException extends Exception {

	private static final long serialVersionUID = 1L;

	//Exception thrown if the letter is already urgent
	public AlreadyUrgentException() {
		super("The letter is already urgent !");
	}
}
