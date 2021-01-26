public class Person {

	public String firstName;
	public String lastName;
	public Address address;
	public String birthday;
	
	public Person(String firstName, String lastName, Address address, String birthday) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.birthday = birthday;
	}

	public String toString() {
		return "Person [First Name= " + firstName + ", Last Name= " + lastName +  ", Birthday= "
				+ birthday  + ", Address= " + address + "]";
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
