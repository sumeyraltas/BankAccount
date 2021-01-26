public class Bank {
	
	public String bankName;
	public Address bankAddress;
	
	public Bank(String bankName, Address bankAddress) {
		
		this.bankName = bankName;
		this.bankAddress = bankAddress;
	}


	public String toString() {
		return "Bank [Bank Name= " + bankName + ", Bank Address= " + bankAddress + "]";
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Address getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(Address bankAddress) {
		this.bankAddress = bankAddress;
	}	
}
