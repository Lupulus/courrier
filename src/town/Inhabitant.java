package town;

public class Inhabitant {
	private String name;
	private BankAccount inhabitantBankAccount;
	
	public Inhabitant(String name){
		this.name = name;
		inhabitantBankAccount = new BankAccount((int) (Math.random()*(1000-100)));
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
