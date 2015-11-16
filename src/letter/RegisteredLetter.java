package letter;

public class RegisteredLetter<C extends Content> extends LetterDecorator<C> {

	private int cost = 10;
	
	public RegisteredLetter(Letter<C> letter) {
		super(letter);
		super.changeCost(cost);
	}
	
	

}
