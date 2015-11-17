package letter;

import town.Inhabitant;

public class AcknowledgmentOfReceipt extends SimpleLetter {
	
	public AcknowledgmentOfReceipt(Inhabitant sender, Inhabitant receiver, String text){
		super(sender, receiver, text);
	}
	
	@Override
	public double getCost() {
		return 0;
	}		
}
