package blog.modello;

import java.util.Date;


public class Commento {
	
	private Articolo articoloRiferimento;
	private Utente autoreCommento;
	private int commento_ID;
	private String testo;
	private Date dataInserimento;
	
	
	
	public Commento(Articolo articoloRiferimento, Utente autoreCommento,
			String testo) {
		super();
		this.articoloRiferimento = articoloRiferimento;
		this.autoreCommento = autoreCommento;
		this.testo = testo;
		this.dataInserimento= new Date();
		this.commento_ID=0;
	}
	
	
	public Articolo getArticoloRiferimento() {
		return articoloRiferimento;
	}
	public Utente getAutoreCommento() {
		return autoreCommento;
	}
	public int getCommento_ID() {
		return commento_ID;
	}
	public String getTesto() {
		return testo;
	}
	public Date getDataInserimento() {
		return dataInserimento;
	}

}