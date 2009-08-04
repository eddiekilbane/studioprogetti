package model.beans;

import java.io.Serializable;


public class Address implements Serializable {

	private String street;
	private String zipcode;
	private String city;

	/**
	 * No-arg constructor for JavaBean tools.
	 */
	Address() {}

	/**
	 * Full constructor.
	 */
	public Address(String street, String zipcode, String city) {
		this.street = street;
		this.zipcode = zipcode;
		this.city = city;
	}

	// ********************** Accessor Methods ********************** //

	public String getStreet() { return street; }
	public void setStreet(String street) { this.street = street; }

	public String getZipcode() { return zipcode; }
	public void setZipcode(String zipcode) { this.zipcode = zipcode; }

	public String getCity() { return city; }
	public void setCity(String city) { this.city = city; }

	// ********************** Common Methods ********************** //

	

	

	public String toString() {
		return  "Street: '" + getStreet() + "', " +
				"Zipcode: '" + getZipcode() + "', " +
				"City: '" + getCity() + "'";
	}

	// ********************** Business Methods ********************** //

}
