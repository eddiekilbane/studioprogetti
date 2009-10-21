package actions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;



public class ActionLogin extends Action{

	
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		
		String destinazioneVista;
		
		//1) recupero dati formBean
		formBeans.FormLogin datiLogin = (formBeans.FormLogin)form;
		
		//2) il modello dialoga in input/output con il livello business
		
		
		
		//3) invoco la logica business e ricevo oggetto del modello
			business.OperazioniUtente gestoreUtente = new business.OperazioniUtente();
			model.Utente loggato = gestoreUtente.eseguiLogin(datiLogin.getId(),datiLogin.getPassword());
						
		//4) indirizzo la risposta a seconda dei casi
		if (loggato.getUserID().equals("Non valido")){
			destinazioneVista="fallito";
		}
		else {
			request.setAttribute("utente",loggato);
			destinazioneVista="ok";
		}
			
		return mapping.findForward(destinazioneVista);
	}
}
