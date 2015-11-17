package letter;

import town.Inhabitant;

public class SimpleLetter extends Letter<SimpleContent> {

	public final static double COST = 1;
	
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, String text) {
		super(sender, receiver, COST);
		super.content = new SimpleContent(text); 
	}

	@Override
	public void action() {
		super.action();
	}

	@Override
	public double getCost() {
		return COST;
	}
	
	public String toString() {
		return "simple letter";
	}
}
