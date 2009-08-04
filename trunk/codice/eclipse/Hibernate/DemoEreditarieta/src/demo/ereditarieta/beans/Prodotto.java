package demo.ereditarieta.beans;

public class Prodotto {

	private Long IdProdotto;
	private String descrizione;
	private int quantita;
	private double prezzo;
	public Long getIdProdotto() {
		return IdProdotto;
	}
	public void setIdProdotto(Long idProdotto) {
		IdProdotto = idProdotto;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
}
