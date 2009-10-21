package actions;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;

public class ActionLireInEuro extends Action{

	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		//1) recupero dati formBean
		form.FormEuroConvertitore input = (form.FormEuroConvertitore)form;
		
		//2) elaboro input
		int lire= input.getLire();
		double euro = lire/1936.27;
		
		input.setEuro(euro);
		
		//3) indirizzamento verso vista
		
		return mapping.findForward("successo");
		
	}

	
	
	
	
}
