package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cd;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import formBeans.FormBeanCd;

public class ActionInserisciCd extends Action{

	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String destinazione;
		
		//FormBeanCd 
		System.out.println("In Aggiungi Cd");
		FormBeanCd frmCd= (FormBeanCd)form;
		
		//1) copio i dati del formBean nell'oggetto del model:
		Cd nuovo = new Cd();		
		nuovo.setPrimary(frmCd.getId());
		nuovo.setArtist(frmCd.getTxtArtista());
		nuovo.setTitle(frmCd.getTxtTitolo());
		nuovo.setCompany(frmCd.getTxtEtichetta());
		nuovo.setPrice(frmCd.getTxtPrezzo());
		nuovo.setYear(frmCd.getTxtAnno());
		nuovo.setCountry(frmCd.getTxtPaese());
		nuovo.setQuantity(frmCd.getTxtQuantita());
		
		//invio l'oggetto del model al servizio business
		business.OperazioniAmministratore amministratore = new business.OperazioniAmministratore();
		int r =amministratore.inserisciCd(nuovo);
		
		
		
		if (r==0){
			destinazione="eccezione";
		}
		else {
			
			destinazione="ok";
		}
				
		return mapping.findForward(destinazione);
	}
}
