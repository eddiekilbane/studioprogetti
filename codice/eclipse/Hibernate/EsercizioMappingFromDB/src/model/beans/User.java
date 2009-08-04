package model.beans;

import java.io.Serializable;
import java.util.*;


public class User implements Serializable {

	private Long id = null;
	private int version;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String email;
	private int ranking = 0;
	private Address address;
	private Set items = new HashSet();
	private boolean admin = false;

	/**
	 * No-arg constructor for JavaBean tools.
	 */
	User() {}

	/**
	 * Full constructor.
	 */
	public User(String firstname, String lastname, String username,
				String password, String email,
				Address address, Set items) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.items = items;
		
	}

	/**
	 * Simple constructor.
	 */
	public User(String firstname, String lastname,
	            String username, String password, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	// ********************** Accessor Methods ********************** //

	public Long getId() { return id; }

	public String getFirstname() { return firstname; }
	public void setFirstname(String firstname) { this.firstname = firstname; }

	public String getLastname() { return lastname; }
	public void setLastname(String lastname) { this.lastname = lastname; }

	public String getUsername() { return username; }

	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }

	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }

	public int getRanking() { return ranking; }
	public void setRanking(int ranking) { this.ranking = ranking; }

	public Address getAddress() { return address; }
	public void setAddress(Address address) { this.address = address; }

	public Set getItems() { return items; }
	public void addItem(Item item) {
		if (item == null)
			throw new IllegalArgumentException("Can't add a null Item.");
		this.getItems().add(item);
	}

	public boolean isAdmin() { return admin; }
	public void setAdmin(boolean admin) { this.admin = admin; }

	// ********************** Common Methods ********************** //

	

	

	
	// ********************** Business Methods ********************** //

	public void increaseRanking() {
		setRanking(getRanking() + 1);
	}

}
