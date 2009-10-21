package demo.granulosita.beans;

public class Indirizzo implements java.io.Serializable {

	private String via;
	private String cap;
	private String citta;
	private String regione;
	
	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public Indirizzo(){}
	
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public Indirizzo(String via, String cap, String citta) {
		super();
		this.via = via;
		this.cap = cap;
		this.citta = citta;
	}
	
	
	
}
