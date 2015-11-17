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
	
	public void action(){
		this.setOpened(true);
	}
	
	public C getContent() {
		return content;
	}
	
	public double getCost() {
		return cost;
	}
	
	public Inhabitant getSender() {
		return sender;
	}
	
	public Inhabitant getReceiver() {
		return receiver;
	}
	
	public boolean isUrgent() {
		return false;
	}

	public Boolean getOpened() {
		return opened;
	}

	public void setOpened(Boolean opened) {
		this.opened = opened;
	}
	
	
}
