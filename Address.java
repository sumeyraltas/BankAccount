public class Address {
	
	public String street;
	public String city;
	public String postCode;
	public String country;
	
	public Address(String street, String city, String postCode, String country) {
	
		this.street = street;
		this.city = city;
		this.postCode = postCode;
		this.country = country;		
	}
	
	public  String toString() {
		return street +", " + city + ", " + country + ", (" + postCode + ")" ;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}	
}
