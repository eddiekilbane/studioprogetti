package esempio.actions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;


public class ExampleAction extends Action{

	
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response) {
			
			esempio.forms.ExampleForm exampleForm = (esempio.forms.ExampleForm) form;
			
			return mapping.findForward("example");
		}
	
}
