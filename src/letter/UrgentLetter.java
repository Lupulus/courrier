package letter;

public class UrgentLetter<C extends Content> extends LetterDecorator<C> {

	private int cost = 10;
	
	public UrgentLetter(Letter<C> letter) {
		super(letter);
		super.changeCost(cost);
	}
	
	

}
