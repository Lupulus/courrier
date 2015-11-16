package letter;

public class UrgentLetter<C extends Content> extends LetterDecorator<C> {
	
	public UrgentLetter(Letter<C> letter) {
		super(letter);
		super.changeCost(2*letter.getPrice());
	}
	
	@Override
	public void action() {
		super.action();
	}
}
