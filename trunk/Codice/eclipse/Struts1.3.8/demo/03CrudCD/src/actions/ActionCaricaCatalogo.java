package actions;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;

import java.util.Vector;

import dao.DaoCd;

public class ActionCaricaCatalogo extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		
		String destinazione;
		
		System.out.println("In ActionCarica Catalogo");
		
		DaoCd dao = new DaoCd("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/negoziocd","root","stefano");
		Vector <model.Cd> catalogo = dao.getCatalogoCd();
		
		
		
		if (catalogo!=null){
			request.setAttribute("catalogo", catalogo);
			destinazione="ok";
		}
		else {
			destinazione="eccezione";
		}
		
		return mapping.findForward(destinazione);
	
	
	}
}
