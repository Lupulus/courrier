package letter;

public class RegisteredLetter extends LetterDecorator {

	private static final double COST = 15;
	
	public RegisteredLetter(Letter<? extends Content> letter) {
		super(letter);
	}

	//Returns the letter's cost
	@Override
	public double getCost() {
		return super.letter.getCost() + COST;
	}
	
	
	
	//Sends an acknowledgment of receipt to the letter's sender
	@Override
	public void action() {
		super.action();
		String text = super.letter.getReceiver() + " has received your letter";
		Letter<? extends Content> letter = new AcknowledgmentOfReceipt(super.getSender(), super.getReceiver(), text);
		letter.getSender().getCity().sendLetter(letter);
	}
	
	//Returns the letter's description
	public String toString() {
		return this.letter.toString() + " registered letter";
	}
}
