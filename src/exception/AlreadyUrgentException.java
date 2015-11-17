package exception;

public class AlreadyUrgentException extends Exception {

	private static final long serialVersionUID = 1L;

	public AlreadyUrgentException() {
		super("The letter is already urgent !");
	}
}
