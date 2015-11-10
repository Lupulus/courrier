package town;

public class BankAccount {
	private double value;
	
	public BankAccount(int value){
		this.value = value;
	}
	
	public double getAccount(){
		return this.value;
	}
	
	public void setAccount(double value){
		this.value = value;
	}
	
	public void removeCostInAccount(double cost){
		this.value -= cost;
	}
	
	public void addCostInAccount(double cost){
		this.value += cost;
	}
}
