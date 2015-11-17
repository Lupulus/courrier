package letter;

public class NoteContent implements Content {

	private int amount;
	
	public NoteContent(int amount){
		this.amount = amount;
	}
	
	public String getDescription() {
		return "Money content";
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
