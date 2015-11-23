package town;

public class BankAccount {
	private double value;
	
	public BankAccount(int value){
		this.value = value;
	}
	
	//Returns the account's amount
	public double getAccount(){
		return this.value;
	}
	
	//Set the account's amount
	public void setAccount(double value){
		this.value = value;
	}
	
	//Remove a cost from the account
	public void removeCostInAccount(double cost){
		this.value -= cost;
	}
	
	//Add a cost to the account
	public void addCostInAccount(double cost){
		this.value += cost;
	}
}
