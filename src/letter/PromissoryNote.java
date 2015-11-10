package letter;

import town.Inhabitant;

public class PromissoryNote extends Letter<NoteContent> {
	
	public PromissoryNote(Inhabitant sender, Inhabitant receiver, int amount) {
		super(sender, receiver, 1 + amount/100);
		super.content = new NoteContent(amount);
		sender.getBankAccount().removeCostInAccount(amount);
	}

	@Override
	public void action() {
		super.getReceiver().getBankAccount().addCostInAccount(content.getAmount());
	}

}
