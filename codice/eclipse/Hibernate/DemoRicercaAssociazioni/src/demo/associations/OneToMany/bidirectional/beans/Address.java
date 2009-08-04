package demo.associations.OneToMany.bidirectional.beans;

import java.io.Serializable;

/**
 * The address of a User.
 *
 * An instance of this class is always associated with only
 * one <tt>User</tt> and depends on that parent objects lifecycle,
 * it is a component.
 *
 * @see User
 * @author Christian Bauer <christian@hibernate.org>
 */
public class Address implements Serializable {

	private Long id;
	private String street;
	private String zipcode;
	private String city;
	private User utente;
	
	/**
	 * No-arg constructor for JavaBean tools.
	 */
	public Address() {}

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	// ********************** Common Methods ********************** //

	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Address)) return false;

		final Address address = (Address) o;

		if (!city.equals(address.city)) return false;
		if (!street.equals(address.street)) return false;
		if (!zipcode.equals(address.zipcode)) return false;

		return true;
	}

	public int hashCode() {
		int result;
		result = street.hashCode();
		result = 29 * result + zipcode.hashCode();
		result = 29 * result + city.hashCode();
		return result;
	}
 
	public String toString() {
		return  "\tStreet: '" + getStreet() + "', \n" +
				"\tZipcode: '" + getZipcode() + "', \n" +
				"\tCity: '" + getCity() + "'\n";
	}

	public User getUtente() {
		return utente;
	}

	public void setUtente(User utente) {
		this.utente = utente;
	}

	 

	// ********************** Business Methods ********************** //

}
