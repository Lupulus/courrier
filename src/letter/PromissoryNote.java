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
		super.action();
		try{
			if(content.getAmount() <= this.getSender().getBankAccount().getAccount()){
				super.getSender().getBankAccount().removeCostInAccount(content.getAmount());
				super.getReceiver().getBankAccount().addCostInAccount(content.getAmount());
				SimpleLetter letter = new SimpleLetter(super.getReceiver(), super.getSender(), "Thank you for the money");
				letter.getSender().getCity().sendLetter(letter);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	@Override
	public double getCost() {
		return  1 + 0.01 * content.getAmount();
	}
	
	public String toString() {
		return "promissory note (" + content.getAmount() + ")";
	}
	
	

}
