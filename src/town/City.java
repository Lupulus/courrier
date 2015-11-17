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
	
	public void addInhabitant(Inhabitant inhabitant){
		if (inhabitant.getCity() == null) {
			inhabitant.setCity(this);
			inhabitants.add(inhabitant);
		}
	}
	
	public boolean sendLetter(Letter<? extends Content> letter){
		System.out.println("-> " + letter.getSender().getName() + " mails a " + letter.toString() + " to " + letter.getReceiver().getName());
		return postBox.add(letter);
	}
	
	public String getName() {
		return name;
	}
	
	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}
	
	public List<Letter<? extends Content>> getPostBox() {
		return postBox;
	}
	
	public int getSize() {
		return this.inhabitants.size();
	}
	
	public Inhabitant getInhabitant(int index){
		return inhabitants.get(index);
	}
	
	public void distributeLetter(){
		for(Letter<? extends Content> letter : postBox){
			letter.getReceiver().addReceivedLetter(letter);
		}
		postBox = new ArrayList<>();
	}
}
