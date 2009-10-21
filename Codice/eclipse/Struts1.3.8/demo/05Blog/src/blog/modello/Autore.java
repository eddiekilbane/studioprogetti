package blog.modello;

import java.util.*;

public class Autore {
	
	private Vector <Articolo> articoli;
	private int autore_ID;
	private String userID;
	private String password;
	
	public Autore(int autore_ID, String userID, String password) {
		super();
		this.autore_ID = autore_ID;
		this.userID = userID;
		this.password = password;
		this.articoli = new Vector();
	}
	
	public int getAutore_ID() {
		return autore_ID;
	}
	public String getUserID() {
		return userID;
	}
	public String getPassword() {
		return password;
	}

}