package town;

import java.util.List;

import letter.Letter;

public class City {
	private String name;
	private List<Inhabitant> inhabitants;
	private List<Letter> postBox;
	
	public City(String name){
		this.name = name;
	}
	
	public void sendLetter(Letter letter){
		postBox.add(letter);
	}
	
	public void distributeLetter(){
		
	}
}
