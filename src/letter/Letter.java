package letter;

import town.Inhabitant;

public abstract class Letter<C extends Content> {
	
	private Inhabitant sender;
	private Inhabitant receiver;
	private double price;
	protected C content;

	public Letter(Inhabitant sender, Inhabitant receiver, double price) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.price = price;
	}
	
	public abstract void action();
	
	public C getContent() {
		return content;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Inhabitant getSender() {
		return sender;
	}
	
	public Inhabitant getReceiver() {
		return receiver;
	}
	
	
}
