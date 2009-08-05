package actions;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping; 
import javax.servlet.http.HttpSession;


public class CaricaDatiAction extends Action {

	public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
			throws Exception {
	
		
		//1) carica Oggetto
		
		personale.Impiegato beanImp = new personale.Impiegato("Stefano",1000.0,new personale.Data(20,2,1992));
		HttpSession sessione = request.getSession();
		sessione.setAttribute("impiegatoBean", beanImp);
		return mapping.findForward("ImpaginaBean");
		
		
		
		//2) carica Lista
		/*
		personale.ListImpiegati.creaDati();
		java.util.List impiegati = personale.ListImpiegati.dati;
		HttpSession sessione = request.getSession();
		sessione.setAttribute("listaImpiegati", impiegati);
		return (mapping.findForward("ImpaginaLista"));
		*/
		
		
		//3) carica Mappa
		/*
		personale.DatiMappa.creaDati();
		java.util.Map mappa = personale.DatiMappa.dati;
		HttpSession sessione = request.getSession();
		sessione.setAttribute("mappa", mappa);
		return (mapping.findForward("ImpaginaMappa"));
		*/
		
		/*
		personale.MappaImpiegato.creaDati();
		java.util.Map mappa = personale.DatiMappa.dati;
		HttpSession sessione = request.getSession();
		sessione.setAttribute("mappa", mappa);
		return (mapping.findForward("ImpaginaMappa"));
		*/
		
		
	
	}
}
