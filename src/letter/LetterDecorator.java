package letter;

public abstract class LetterDecorator extends Letter<Content> {

	protected Letter<?> letter;
	
	//Instantiates a LetterDecorator with the letter in parameter
	public LetterDecorator(Letter<?> letter) {
		super(letter.getSender(), letter.getReceiver(), letter.getCost());
		this.letter = letter;
	}

	//Returns the letter attribute
	public Letter<?> getLetter() {
		return letter;
	}

}
