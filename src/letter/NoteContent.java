package letter;

public class NoteContent implements Content {

	private int amount;
	
	public NoteContent(int amount){
		this.amount = amount;
	}
	
	//Returns the content's description
	public String getDescription() {
		return "Money content";
	}
	
	//Returns the content's amount
	public int getAmount() {
		return amount;
	}
	
	//Set the content's amount
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
