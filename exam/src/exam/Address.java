package exam;

public class Address {
	
	private int streetNumber;
	private String streetName;
	private String steetName2; // optional
	private String city;
	private String state;
	private int zipcode;

	public Address(int streetNumber, String streetName, String steetName2, String city, String state, int zipcode) {
		super();
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.steetName2 = steetName2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public Address(int streetNumber, String streetName, String city, String state, int zipcode) {
		super();
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.streetName = "";
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getSteetName2() {
		return steetName2;
	}

	public void setSteetName2(String steetName2) {
		this.steetName2 = steetName2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", streetName=" + streetName + ", steetName2=" + steetName2
				+ ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((steetName2 == null) ? 0 : steetName2.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + streetNumber;
		result = prime * result + zipcode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (steetName2 == null) {
			if (other.steetName2 != null)
				return false;
		} else if (!steetName2.equals(other.steetName2))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (streetNumber != other.streetNumber)
			return false;
		if (zipcode != other.zipcode)
			return false;
		return true;
	}

}