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
	
	//Returns the inhabitant's name
	public String getName(){
		return this.name;
	}
	
	//Set the inhabitant's name
	public void setName(String name){
		this.name = name;
	}
	
	//Returns the inhabitant's account
	public BankAccount getBankAccount(){
		return this.bankAccount;
	}
	
	//Adds a letter to the list of received letters
	public void addReceivedLetter(Letter<? extends Content> letter){
		receivedLetter.add(letter);
	}

	//Returns the list of received letters
	public List<Letter<? extends Content>> getReceivedLetter(){
		return receivedLetter;
	}
	
	//Returns the inhabitant's city
	public City getCity() {
		return city;
	}

	//Set the inhabitant's city
	public void setCity(City city) {
		this.city = city;
	}
}
