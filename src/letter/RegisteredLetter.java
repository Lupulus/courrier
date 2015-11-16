package letter;

public class RegisteredLetter<C extends Content> extends LetterDecorator<C> {

	private int cost = 15;
	private AcknowledgmentOfReceipt receipt;
	
	public RegisteredLetter(Letter<C> letter) {
		super(letter);
		super.changeCost(letter.getPrice() + cost);
		this.receipt = new AcknowledgmentOfReceipt(letter.getSender(), letter.getReceiver());
	}

	@Override
	public void action() {
		super.action();
		receipt.action();
	}
}
