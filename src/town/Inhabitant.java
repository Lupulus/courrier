package town;

import java.util.List;

import letter.Letter;

public class Inhabitant {
	private String name;
	private BankAccount bankAccount;
	private List<Letter> receivedLetter;
	
	public Inhabitant(String name){
		this.name = name;
		bankAccount = new BankAccount((int) (Math.random()*(1000-100)));
		receivedLetter = null;
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public BankAccount getBankAccount(){
		return this.bankAccount;
	}
	
	public void addReceivedLetter(Letter letter){
		receivedLetter.add(letter);
	}
	
}
