package demo.granulosita.beans;

public class Impiegato implements java.io.Serializable {

	private Long id;
	private String nome;
	private String cognome;
	private String qualifica;
	private String paese;
	private String telefono;
	private Indirizzo indirizzo;
	
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Impiegato(){}
	
	public Impiegato(Long id, String nome, String cognome, String qualifica,
			String paese, String telefono) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.qualifica = qualifica;
		this.paese = paese;
		this.telefono = telefono;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getQualifica() {
		return qualifica;
	}
	public void setQualifica(String qualifica) {
		this.qualifica = qualifica;
	}
	public String getPaese() {
		return paese;
	}
	public void setPaese(String paese) {
		this.paese = paese;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
