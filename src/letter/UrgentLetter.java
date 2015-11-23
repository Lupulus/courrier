package letter;

import exception.AlreadyUrgentException;

public class UrgentLetter extends LetterDecorator {
	
	public UrgentLetter(Letter<?> letter) throws AlreadyUrgentException {
		super(letter);
		if (letter.isUrgent()) {
			throw new AlreadyUrgentException();
		}
	}
	
	@Override
	public void action() {
		super.letter.action();
	}
	
	@Override
	public double getCost() {
		return super.letter.getCost() * 2;
	}
	
	@Override
	public boolean isUrgent() {
		return true;
	}

	public String toString() {
		return this.letter.toString() + " urgent";
	}
}
