package actions;

/**
 * @(#)FormBasicsAction.java
 *
 *
 * @author 
 * @version 1.00 2008/9/17
 */


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping; 

import forms.FormBasicsForm;

/**
 * Action class to demonstrate handling an <html:cancel> tag
 *
 * @author Kevin Bedell & James Turner
 * @version 1.0
 */

public class FormBasicsAction extends Action {

    /**
     * Do Nothing except forward the request
     *
     * @param mapping The ActionMapping from this struts-config.xml entry
     * @param actionForm The ActionForm to process, if any
     * @param request The JSP request object
     * @param response The JSP response object
     *
     * @exception Exception if business logic throws an exception
     */
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
        throws Exception {

        FormBasicsForm fbf = (FormBasicsForm) form;

        
        // da testare coi System.out.println
        
        
        if (isCancelled(request)) {

            /*
             * If request was cancelled, we would clean up any processing
             * that was unfinished and release any resources we may
             * have locked.
             */

            // Set status to reflect that cancel WAS pressed!
            fbf.setStatus("e' stato premuto cancel");

            return (mapping.findForward("default"));
        }  else {

            // Set status to reflect that cancel WAS NOT pressed!
            fbf.setStatus("e' stato premuto submit!");

            return (mapping.findForward("default"));
        }
    }
}
