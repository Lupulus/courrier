package letter;

import town.Inhabitant;

public class AcknowledgmentOfReceipt {

	private Inhabitant sender;
	private Inhabitant receiver;
	
	public AcknowledgmentOfReceipt(Inhabitant sender, Inhabitant receiver){
		this.receiver = receiver;
		this.sender = sender;;
	}
	
	public void action(){
		sender.addReceipt(this);
	}

	public Inhabitant getSender() {
		return sender;
	}

	public Inhabitant getReceiver() {
		return receiver;
	}

}
