package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping; 
import javax.servlet.http.HttpSession;

public class CopiaBeanAction extends Action{
	
	public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
			throws Exception {
		
		
		forms.FormBeanImpiegato beanImp=(forms.FormBeanImpiegato)form;
		
		
		//1) copia a mano:
		
		personale.Impiegato beanModello = new personale.Impiegato();
		beanModello.setNome(beanImp.getNome());
		beanModello.setStipendio(beanImp.getStipendio());
		personale.Data dataAss = new personale.Data(beanImp.getGiorno(),beanImp.getMese(),beanImp.getAnno());
		beanModello.setAssunzione(dataAss);
		
		HttpSession sessione =request.getSession();
		sessione.setAttribute("impiegatoForm",beanModello);
		
		return mapping.findForward("OutImpiegato");
	}
	
	

}
