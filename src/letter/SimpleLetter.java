package letter;

import town.Inhabitant;

public class SimpleLetter extends Letter<SimpleContent> {

	public final static double COST = 1;
	
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, String text) {
		super(sender, receiver, COST);
		super.content = new SimpleContent(text); 
	}

	//Set the letter's value opened as true
	@Override
	public void action() {
		super.action();
	}

	//Returns the letter's cost
	@Override
	public double getCost() {
		return COST;
	}
	
	//Returns the letter description
	public String toString() {
		return "simple letter";
	}
}
