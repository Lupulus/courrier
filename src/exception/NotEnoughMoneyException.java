package exception;

public class NotEnoughMoneyException extends Exception {
	
	private static final long serialVersionUID = 1L;

	//Exception thrown if the sender hasnt enough money on his acoount
	public NotEnoughMoneyException(){
		super("The sender has not enough money on his account !");
	}

}
