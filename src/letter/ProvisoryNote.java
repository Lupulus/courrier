package letter;

import town.Inhabitant;

public class ProvisoryNote extends Letter<NoteContent> {
	
	public ProvisoryNote(Inhabitant sender, Inhabitant receiver, int amount) {
		super(sender, receiver, 1 + amount/100);
		super.content = new NoteContent(amount);
	}

	@Override
	public void action() {
		
	}

}
