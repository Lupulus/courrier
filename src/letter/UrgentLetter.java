package letter;

import exception.AlreadyUrgentException;

public class UrgentLetter extends LetterDecorator {
	
	public UrgentLetter(Letter<?> letter) throws AlreadyUrgentException {
		super(letter);
		if (letter.isUrgent()) {
			throw new AlreadyUrgentException();
		}
	}
	
	//Set the letter's value opened as true
	@Override
	public void action() {
		super.letter.action();
	}
	
	//Returns the letter's cost
	@Override
	public double getCost() {
		return super.letter.getCost() * 2;
	}
	
	//Set the letter as urgent
	@Override
	public boolean isUrgent() {
		return true;
	}

	//Returns the letter description
	public String toString() {
		return this.letter.toString() + " urgent letter";
	}
}
