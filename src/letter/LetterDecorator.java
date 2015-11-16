package letter;

public abstract class LetterDecorator<C extends Content> extends Letter<C> {

	private Letter<C> letter;
	
	public LetterDecorator(Letter<C> letter) {
		super(letter.getSender(), letter.getReceiver(), letter.getPrice());
		this.letter = letter;
	}

	@Override
	public void action() {
		letter.action();
	}
	
	public void changeCost(int cost){
		letter.setPrice(cost);
	}

	public Letter<C> getLetter() {
		return letter;
	}

	public void setLetter(Letter<C> letter) {
		this.letter = letter;
	}
	
}
