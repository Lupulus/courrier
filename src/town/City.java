package town;

import java.util.ArrayList;
import java.util.List;

import letter.Content;
import letter.Letter;

public class City {
	private String name;
	private List<Inhabitant> inhabitants;
	private List<Letter<Content>> postBox;
	
	public City(String name){
		this.name = name;
		this.inhabitants = new ArrayList<Inhabitant>();
		this.postBox = new ArrayList<Letter<Content>>();
	}
	
	public void sendLetter(Letter<Content> letter){
		postBox.add(letter);
	}
	
	public String getName() {
		return name;
	}
	
	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}
	
	public List<Letter<Content>> getPostBox() {
		return postBox;
	}
	
	public void distributeLetter(){
		for(Letter<Content> letter : postBox){
			Inhabitant receiver = letter.getReceiver();
			receiver.addReceivedLetter(letter);
		}
	}
}
