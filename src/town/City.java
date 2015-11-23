package town;

import java.util.ArrayList;
import java.util.List;

import letter.Content;
import letter.Letter;

public class City {
	private String name;
	private List<Inhabitant> inhabitants;
	private List<Letter<? extends Content>> postBox;
	
	public City(String name){
		this.name = name;
		this.inhabitants = new ArrayList<Inhabitant>();
		this.postBox = new ArrayList<Letter<? extends Content>>();
	}
	
	//Add an inhabitant to the city
	public void addInhabitant(Inhabitant inhabitant){
		if (inhabitant.getCity() == null) {
			inhabitant.setCity(this);
			inhabitants.add(inhabitant);
		}
	}
	
	//Returns true if the sending of the letter was successed, else false
	public boolean sendLetter(Letter<? extends Content> letter){
		System.out.println("-> " + letter.getSender().getName() + " mails a " + letter.toString() + " to " + letter.getReceiver().getName());
		return postBox.add(letter);
	}
	
	//Set the city's name
	public void setName(String name){
		this.name = name;
	}
	
	//Returns the city's name
	public String getName() {
		return name;
	}
	
	//Returns the city's list of inhabitants 
	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}
	
	//Returns the city's list of letters
	public List<Letter<? extends Content>> getPostBox() {
		return postBox;
	}
	
	//Returns the city's number of inhabitants
	public int getSize() {
		return this.inhabitants.size();
	}
	
	//Returns the inhabitant at the index i
	public Inhabitant getInhabitant(int index){
		return inhabitants.get(index);
	}
	
	//Sends the letters in the postbox
	public void distributeLetter(){
		for(Letter<? extends Content> letter : postBox){
			letter.getReceiver().addReceivedLetter(letter);
		}
		postBox = new ArrayList<>();
	}
}
