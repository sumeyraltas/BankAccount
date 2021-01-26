public class BankAccount {

	public Bank bank;
	public Person owner;
	public double balance;
	public int accountNumber;
	
	public BankAccount(Bank bank, Person owner, double balance, int accountNumber) {
		this.bank = bank;
		this.owner = owner;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}


	public double withdraw ( double amount ) {
		
		if(amount > balance ){
			//System.out.println("Cannot withdraw a bigger amount than balance.");
			return -1 ;
		}
		else {
			
			balance = balance - amount; 
			return balance;
		
		}
	}
	
	public double deposit ( double amount ) {
		
		balance = balance + amount;
		return balance; 
	}
	
	public String toString() {
		return   "Bank Account Information: " + "\n" + 
				"Balance= " + balance + "\n" +
				"Account Number= " + accountNumber + "\n" +
				bank + "\n"
				+ owner;
		
	}
	
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
