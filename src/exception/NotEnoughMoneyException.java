package exception;

public class NotEnoughMoneyException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public NotEnoughMoneyException(){
		super("The sender has not enough money on his account !");
	}

}
