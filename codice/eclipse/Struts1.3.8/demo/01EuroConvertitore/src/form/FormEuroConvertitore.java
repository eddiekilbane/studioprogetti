package form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;


public class FormEuroConvertitore extends ActionForm{

	

	private int lire;
	private double euro;
	
	
	public FormEuroConvertitore() {
		this.lire=0;
		this.euro=0.0;
	}


	public int getLire() {
		return lire;
	}


	public void setLire(int lire) {
		this.lire = lire;
	}


	public double getEuro() {
		return euro;
	}


	public void setEuro(double euro) {
		this.euro = euro;
	}
	
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		super.reset(mapping, request);
	}


	// VALIDAZIONE
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return super.validate(mapping, request);
	}

	
	
	
}
