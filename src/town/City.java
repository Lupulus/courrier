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
		Inhabitant sendeur = inhabitants.get(letter.getSendeur());
		sendeur.getBankAccount().removeCostInAccount(letter.getAmount());
	}
	
	public void distributeLetter(){
		for(Letter letter : postBox){
			Inhabitant receiveur = inhabitants.get(letter.getReceiveur());
			receiveur.addReceivedLetter(letter);
		}
	}
}
