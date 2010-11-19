package corso.jms.mdb.demo.server.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TicketRDA implements java.io.Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getDescrizioneProblema() {
		return descrizioneProblema;
	}
	public void setDescrizioneProblema(String descrizioneProblema) {
		this.descrizioneProblema = descrizioneProblema;
	}
	public String getNumeroMatricola() {
		return numeroMatricola;
	}
	public void setNumeroMatricola(String numeroMatricola) {
		this.numeroMatricola = numeroMatricola;
	}
	public String getNumeroDocumentoAcquisto() {
		return numeroDocumentoAcquisto;
	}
	public void setNumeroDocumentoAcquisto(String numeroDocumentoAcquisto) {
		this.numeroDocumentoAcquisto = numeroDocumentoAcquisto;
	}
	public Date getDataAcquisto() {
		return dataAcquisto;
	}
	public void setDataAcquisto(Date dataAcquisto) {
		this.dataAcquisto = dataAcquisto;
	}
	private String modello;
	private String descrizioneProblema;
	private String numeroMatricola;
	private String numeroDocumentoAcquisto;
	private Date dataAcquisto;
	
	
	
}
