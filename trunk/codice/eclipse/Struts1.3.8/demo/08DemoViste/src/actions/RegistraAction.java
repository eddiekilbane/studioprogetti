package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping; 

import forms.FormBasicsForm;

public class RegistraAction extends Action{

	
	public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
			throws Exception {


		System.out.println("In Action!!************");
		forms.FormBeanUtenteRegistrato frm= (forms.FormBeanUtenteRegistrato)form;
		
		System.out.println(frm.toString());

				return (mapping.findForward("eco"));

	}
	
	
	
	
	
}
