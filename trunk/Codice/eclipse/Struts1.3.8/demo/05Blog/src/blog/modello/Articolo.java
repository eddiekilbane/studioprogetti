package blog.modello;

import java.util.*;

public class Articolo {
	
	private int articoloId;
	private Autore autore;
	private Vector <Commento> commenti;
	private String titolo;
	private String testo;
	private Date dataInserimento;
	
	
	
	
	
	public Articolo(int articoloId, Autore autore, String titolo, String testo,
			Date dataInserimento) {
		super();
		this.articoloId = articoloId;
		this.autore = autore;
		this.titolo = titolo;
		this.testo = testo;
		this.dataInserimento = dataInserimento;
		this.commenti= new Vector();
	}
	
	
	public int getArticoloId() {
		return articoloId;
	}
	public void setArticoloId(int articoloId) {
		this.articoloId = articoloId;
	}
	public Autore getAutore() {
		return autore;
	}
	public void setAutore(Autore autore) {
		this.autore = autore;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public Date getDataInserimento() {
		return dataInserimento;
	}
	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

}