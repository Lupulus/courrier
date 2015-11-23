package letter;

import town.Inhabitant;

public abstract class Letter<C extends Content> {
	
	private Inhabitant sender;
	private Inhabitant receiver;
	private double cost;
	protected C content;
	private Boolean opened;

	public Letter(Inhabitant sender, Inhabitant receiver, double cost) {
		this.sender = sender;
		this.receiver = receiver;
		this.cost = cost;
		this.setOpened(false);
	}
	
	//Set the opened value as true
	public void action(){
		this.setOpened(true);
	}
	
	//returns the letter's content
	public C getContent() {
		return content;
	}
	
	//Returns the letter's cost
	public double getCost() {
		return cost;
	}
	
	//Returns the letter's sender
	public Inhabitant getSender() {
		return sender;
	}
	
	//Returns the letter's receiver
	public Inhabitant getReceiver() {
		return receiver;
	}
	
	//Returns true if the letter is urgent, else false
	public boolean isUrgent() {
		return false;
	}

	//Returns true if the letter was opened, else false
	public Boolean getOpened() {
		return opened;
	}

	//Set the opened value
	public void setOpened(Boolean opened) {
		this.opened = opened;
	}
	
	
}
