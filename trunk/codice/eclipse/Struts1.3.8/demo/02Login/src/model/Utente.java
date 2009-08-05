package model;

import java.util.*;

public class Utente {
	
	private int utente_ID;
	private String userID;
	private String password;
	private String nome;
	private String cognome;
	private String telefono;
	private String email;
	
	
	
	public int getUtente_ID() {
		return utente_ID;
	}
	public void setUtente_ID(int utente_ID) {
		this.utente_ID = utente_ID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Utente(){}
	
	public Utente(int utente_ID, String userID, String password, String nome,
			String cognome, String telefono, String email) {
		super();
		this.utente_ID = utente_ID;
		this.userID = userID;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.email = email;
	}

	
	
	
	
}