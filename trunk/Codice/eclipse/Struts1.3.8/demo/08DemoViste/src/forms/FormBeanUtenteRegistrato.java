package forms;
 
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;


public class FormBeanUtenteRegistrato extends ActionForm{

	private String username;
	private String password;
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private String sesso;
	private int giorno;
	private int mese;
	private int anno;
	private String email;
	private String telefono;
	private String fax;
	private String indirizzo;
	private String cap;
	private String citta;
	private String provincia;
	private String nazione;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	public int getGiorno() {
		return giorno;
	}
	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}
	public int getMese() {
		return mese;
	}
	public void setMese(int mese) {
		this.mese = mese;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
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
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getNazione() {
		return nazione;
	}
	public void setNazione(String nazione) {
		this.nazione = nazione;
	}
	
	public String toString (){
		  
		return ""+
		this.username+"\n"+
		  this.password+"\n"+
		  this.nome+"\n"+
		  this.cognome+"\n"+
		  this.codiceFiscale+"\n"+
		  this.sesso+"\n"+
		  this.giorno+"\n"+
		  this.mese+"\n"+
		  this.anno+"\n"+
		  this.email+"\n"+
		  this.telefono+"\n"+
		  this.fax+"\n"+
		  this.indirizzo+"\n"+
		  this.cap+"\n"+
		  this.citta+"\n"+
		  this.provincia+"\n"+
		  this.nazione+"\n";
		
		
	}
	
	
}
