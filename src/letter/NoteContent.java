package letter;

public class NoteContent implements Content {

	private int amount;
	
	public NoteContent(int amount) {
		this.amount = amount;
	}
	
	public String getDescription() {
		return "Note Content";
	}
	
	public int getAmount() {
		return amount;
	}

}
