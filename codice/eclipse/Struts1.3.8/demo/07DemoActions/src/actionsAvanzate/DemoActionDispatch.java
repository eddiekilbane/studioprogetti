


package actionsAvanzate;

// package SUN
import javax.servlet.http.*;

// package di Struts
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;



public class DemoActionDispatch extends DispatchAction 
{
	
	public ActionForward metodo1(ActionMapping mapping,ActionForm form,
				HttpServletRequest req,HttpServletResponse res) throws Exception
	{
			
		System.out.println("Azione 1, sono nel metodo 1.");
		System.out.println("inoltro alla risorsa: prima.jsp");
		return (mapping.findForward("successOne"));		

	}
	
	public ActionForward metodo2(ActionMapping mapping,ActionForm form,
			HttpServletRequest req,HttpServletResponse res) throws Exception
	{
		
	System.out.println("Azione 1, sono nel metodo 2.");
	System.out.println("inoltro alla risorsa: seconda.jsp");
	return (mapping.findForward("successTwo"));		

	}
	
}