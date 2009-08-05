package formBeans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;


public class FormBeanCd extends ActionForm{
	
	private long id;
	private String txtTitolo;
	private String txtArtista;
	private String txtPaese;
	private String txtEtichetta;
	private double txtPrezzo;
	private int txtQuantita;
	private int txtAnno;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTxtTitolo() {
		return txtTitolo;
	}
	public void setTxtTitolo(String txtTitolo) {
		this.txtTitolo = txtTitolo;
	}
	public String getTxtArtista() {
		return txtArtista;
	}
	public void setTxtArtista(String txtArtista) {
		this.txtArtista = txtArtista;
	}
	public String getTxtPaese() {
		return txtPaese;
	}
	public void setTxtPaese(String txtPaese) {
		this.txtPaese = txtPaese;
	}
	public String getTxtEtichetta() {
		return txtEtichetta;
	}
	public void setTxtEtichetta(String txtEtichetta) {
		this.txtEtichetta = txtEtichetta;
	}
	public double getTxtPrezzo() {
		return txtPrezzo;
	}
	public void setTxtPrezzo(double txtPrezzo) {
		this.txtPrezzo = txtPrezzo;
	}
	public int getTxtQuantita() {
		return txtQuantita;
	}
	public void setTxtQuantita(int txtQuantita) {
		this.txtQuantita = txtQuantita;
	}
	public int getTxtAnno() {
		return txtAnno;
	}
	public void setTxtAnno(int txtAnno) {
		this.txtAnno = txtAnno;
	}
	
	

}
