package actions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;

public class ActionEuroInLire extends Action{

	 
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		//1) recupero input della Form:
		form.FormEuroConvertitore input = (form.FormEuroConvertitore)form;
		
		//2) copio i dati del FormBean nell'oggetto Pojo (bean) a livello di Model:
		
		//3) costruisco il componente Business ed invoco il metodo contenente la logica specifica
		
		//4) gestione risultato: (HttpSession, ActionForm)
		
		//5) Indirizzo in base al risultato la response verso una delle viste.
		return mapping.findForward("successo");
		
	}
	
	
	

}
