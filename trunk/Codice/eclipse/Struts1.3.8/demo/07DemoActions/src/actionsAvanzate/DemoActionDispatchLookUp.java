package actionsAvanzate;

// package SUN
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.*;

// package di Struts
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;



public class DemoActionDispatchLookUp extends LookupDispatchAction
{
	
	protected Map getKeyMethodMap(){
		Map map = new HashMap();
		map.put("chiave1","metodo1");
		map.put("chiave2","metodo2");
		return map;
	}

	
	public ActionForward metodo1(ActionMapping mapping,ActionForm form,
				HttpServletRequest req,HttpServletResponse res) throws Exception
	{
			
		System.out.println("Azione 2, sono nel metodo 1.");
		System.out.println("inoltro alla risorsa: terza.jsp");
		return (mapping.findForward("successThree"));		

	}
	
	public ActionForward metodo2(ActionMapping mapping,ActionForm form,
			HttpServletRequest req,HttpServletResponse res) throws Exception
{
		
	System.out.println("Azione 2, sono nel metodo 2.");
	System.out.println("inoltro alla risorsa: quarta.jsp");
	return (mapping.findForward("successFour"));		

}	
	
}