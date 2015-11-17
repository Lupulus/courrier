package letter;

public abstract class LetterDecorator extends Letter<Content> {

	protected Letter<?> letter;
	
	public LetterDecorator(Letter<?> letter) {
		super(letter.getSender(), letter.getReceiver(), letter.getCost());
		this.letter = letter;
	}

	public Letter<?> getLetter() {
		return letter;
	}

}
