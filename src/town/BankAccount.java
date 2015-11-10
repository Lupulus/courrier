package town;

public class BankAccount {
	private int account;
	
	public BankAccount(int value){
		this.account = value;
	}
	
	public int getAccount(){
		return this.account;
	}
	
	public void setAccount(int value){
		this.account = value;
	}
	
	public void removeCostInAccount(int cost){
		this.account = this.account - cost;
	}
	
	public void addPromissoryInAccount(int promissory){
		
	}
}
