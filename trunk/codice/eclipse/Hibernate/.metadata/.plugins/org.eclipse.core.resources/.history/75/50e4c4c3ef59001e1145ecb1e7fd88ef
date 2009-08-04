package demo.associations.OneToMany.unidirectional.beans;

import java.io.Serializable;
import java.util.*;


 
public class User implements Serializable {

	private Long id = null;
	//private int version;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String email;
	private int ranking = 0;
	
	

	/**
	 * No-arg constructor for JavaBean tools.
	 */
	public User() {}

	/**
	 * Full constructor.
	 */
	/*
	public User(String firstname, String lastname, String username,
				String password, String email,
				Address address, Set items,
				Set billingDetails) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	/**
	 * Simple constructor.
	
	public User(String firstname, String lastname,
	            String username, String password, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
	}
 */
	
	// ********************** Accessor Methods ********************** //
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	
	
	/*
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	*/
	
	 
	
	
	
	
	
	// ********************** Common Methods ********************** //

	

	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User)) return false;
		final User user = (User) o;
		if (!username.equals(user.username)) return false;
		return true;
	}

	public int hashCode() {
		return username.hashCode();
	}

	public String toString() {
		return  "User ('" + getId() + "'), " +
				"firstName: '" + getFirstname() + "'\n"+
				"lastName: '" + getLastname() + "'\n"+
				"Username: '" + getUsername() + "'\n"+
				"password: '" + getPassword() + "'\n"+
				"Email: '" + getEmail() + "'\n"+
				//"Indirizzo: '" + getAddresses().toString() + "'\n"+
				"ranking: '" + getRanking() + "')";
						
	} 
 

	// ********************** Business Methods ********************** //

		public void increaseRanking() {
		setRanking(getRanking() + 1);
	}

	

}
