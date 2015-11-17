package town;

import java.util.ArrayList;
import java.util.List;

import letter.Content;
import letter.Letter;

public class Inhabitant {
	private String name;
	private City city;
	private BankAccount bankAccount;
	private List<Letter<? extends Content>> receivedLetter;
	
	public Inhabitant(String name){
		this.name = name;
		bankAccount = new BankAccount((int) (Math.random()*(1000-100)));
		receivedLetter = new ArrayList<>();
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
	
	public void addReceivedLetter(Letter<? extends Content> letter){
		receivedLetter.add(letter);
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
}
