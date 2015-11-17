package main;

import exception.AlreadyUrgentException;
import letter.Content;
import letter.Letter;
import letter.PromissoryNote;
import letter.RegisteredLetter;
import letter.SimpleLetter;
import letter.UrgentLetter;
import town.City;
import town.Inhabitant;

public class Courrier<C extends Content> {
	
	private static City city;
	
	public static void main(String[] args) {
		city = initCity("Guantanamo", 100);
		int days = 4;
		mailing(days);
	
	}
	
	public static City initCity(String name, int inhabitants){
		City city = new City(name);
		System.out.println("Creating " + city.getName() + " city");
		
		for(int i = 0; i < inhabitants; i++){
			Inhabitant inhabitant = new Inhabitant("inhabitant"+i);
			city.addInhabitant(inhabitant);
		}
		System.out.println("Creating " + inhabitants + " inhabitants");
		return city;
	}

	public static void mailing(int days){
		for(int i = 0; i < days; i++){
			city.distributeLetter();
			int r = (int) (Math.random()*city.getSize());
			System.out.println(r);
			for(int j=0; j < r; j++){
				try{
					city.sendLetter(createRandomLetter());
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public static Letter<? extends Content> createRandomLetter() throws AlreadyUrgentException{
		Inhabitant sender = getRandomInhabitant();
		Inhabitant receiver = getRandomInhabitant();
		int r = (int) (Math.random()*2);
		Letter<?> letter;
		if(r==0) 
			letter = new SimpleLetter(sender, receiver, "");
		else letter = new PromissoryNote(sender, receiver, 100);
		System.out.println(letter.getReceiver().getName() + " " +letter.getSender().getName());
		
		r = (int) (Math.random()*2);
		if(r==0)
			letter = new RegisteredLetter(letter);
		else letter = new UrgentLetter(letter);
		return letter;
	}
	
	public static Inhabitant getRandomInhabitant(){
		int r = (int) (Math.random()*city.getSize());
		return city.getInhabitant(r);		
	}
}
