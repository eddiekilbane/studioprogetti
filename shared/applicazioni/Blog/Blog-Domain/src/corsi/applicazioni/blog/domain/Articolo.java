package corsi.applicazioni.blog.domain;

import java.util.List;

public class Articolo {

	private Long idArticolo;
	private String titolo;
	private List<String> tags;
	private String categoria;
	private String testo;
	private List<Commento> commenti;
	private Utente autore;
	private byte[] immagine;
	
	
	
	
	public Long getIdArticolo() {
		return idArticolo;
	}
	public void setIdArticolo(Long idArticolo) {
		this.idArticolo = idArticolo;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public List<Commento> getCommenti() {
		return commenti;
	}
	public void setCommenti(List<Commento> commenti) {
		this.commenti = commenti;
	}
	public Utente getAutore() {
		return autore;
	}
	public void setAutore(Utente autore) {
		this.autore = autore;
	}
	public byte[] getImmagine() {
		return immagine;
	}
	public void setImmagine(byte[] immagine) {
		this.immagine = immagine;
	}
	
	
}
