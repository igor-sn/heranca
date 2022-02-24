package entities;

public class Account {
	
	private Integer numberInteger;
	private String holder;
	protected double balance;
	
	public Account() {
		
	}
	
	
	public Account(Integer numberInteger, String holder, double balance) {
	
		this.numberInteger = numberInteger;
		this.holder = holder;
		this.balance = balance;
	}


	public Integer getNumberInteger() {
		return numberInteger;
	}


	public void setNumberInteger(Integer numberInteger) {
		this.numberInteger = numberInteger;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public double getBalance() {
		return balance;
	}

	public void withdraw (double amount) {
		balance -= amount;
	}
	
	public void deposit (double amount) {
		balance += amount;
	}
	
}
