package forms;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionErrors;

/**
 * <p>Title: HtmlErrorsForm.java </p>
 * <p>Description: Form Bean for the &lt;html:errors&gt; example</p>
 * <p>Copyright: Copyright (c) 2002</p>
 * @author Kevin Bedell & James Turner
 * @version 1.0
 *
 */
public class HtmlErrorsForm extends ActionForm {

  // Default bean constructor
  public HtmlErrorsForm() { }

  private boolean checkbox1;
  public boolean getCheckbox1() { return this.checkbox1; }
  public void setCheckbox1(boolean checkbox1) { this.checkbox1 = checkbox1; }
  
  // --------------------------------------------------------- Public Methods

    /**
     * Reset all properties to their default values.
     *
     * @param mapping The mapping used to select this instance
     * @param request The servlet request we are processing
     */
     public void reset(ActionMapping mapping, HttpServletRequest request) {
         this.setCheckbox1(false);
     }

     /**
      * Validate the properties posted in this request. If validation errors are
      * found, return an <code>ActionErrors</code> object containing the errors.
      * If no validation errors occur, return <code>null</code> or an empty
      * <code>ActionErrors</code> object.
      *
      * @param mapping The current mapping (from struts-config.xml)
      * @param request The servlet request object
      * @return ActionErrors The ActionErrors object containing the errors.
      */
     public ActionErrors validate(ActionMapping mapping,
                                  HttpServletRequest request) {

    	 ActionErrors errors = new ActionErrors();

         /*
          * If the checkbox is checked, display error messages
          */
         if ( this.getCheckbox1() ) {

             // First, a GLOBAL_ERROR message for the entire page.
             errors.add("",
                     new ActionMessage("ch12.global.error") );
             // Also, display a specific error for this parameter
             errors.add("checkbox1", new ActionMessage("ch12.checkbox.error"));
         }

         return errors;
     }
}
