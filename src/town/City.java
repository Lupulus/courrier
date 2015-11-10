package town;

import java.util.List;

import letter.Content;
import letter.Letter;

public class City {
	private String name;
	private List<Inhabitant> inhabitants;
	private List<Letter<Content>> postBox;
	
	public City(String name){
		this.name = name;
	}
	
	public void sendLetter(Letter<Content> letter){
		postBox.add(letter);
	}
	
	public void distributeLetter(){
		for(Letter<Content> letter : postBox){
			Inhabitant receiver = letter.getReceiver();
			receiver.addReceivedLetter(letter);
		}
	}
}
