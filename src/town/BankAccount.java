package town;

public class BankAccount {
	private int value;
	
	public BankAccount(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	public void removeCostInValue(int cost){
		this.value = this.value - cost;
	}
}
