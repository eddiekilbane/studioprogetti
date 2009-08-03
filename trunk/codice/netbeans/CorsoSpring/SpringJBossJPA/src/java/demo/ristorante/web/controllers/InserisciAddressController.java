/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.web.controllers;

import demo.ristorante.services.ServizioAddress;
import demo.ristorante.web.beans.Address;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/** 
 *
 * @author stefano
 */
public class InserisciAddressController extends SimpleFormController {

    static Logger log;

    public ServizioAddress getServizioAddress() {
        return servizioAddress;
    }

    public void setServizioAddress(ServizioAddress servizioAddress) {
        this.servizioAddress = servizioAddress;
    }
    private ServizioAddress servizioAddress;


    public InserisciAddressController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        //setCommandClass(MyCommand.class);
        //setCommandName("MyCommandName");
       //setSuccessView("inserimentoOk");
        //setFormView("formView");
    }
    
//    @Override
//    protected void doSubmitAction(Object command) throws Exception {
//        log.debug("In Submit");
//        System.out.println("In submit");
//       // throw new UnsupportedOperationException("Not yet implemented");
//    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
 /*
    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
      
      Address obj= new Address();
      obj.setId(1L);
      obj.setStreetName("inserire via");
      obj.setStreetNumber(0);
      
      return obj;
  }
*/

 @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {

     /*
            TestSgateDatasource test = new TestSgateDatasource();
            test.pingConnection();
*/


            ModelAndView mv = new ModelAndView(getSuccessView());
            Address add = (Address)command;
            demo.ristorante.domain.Address indirizzo= new demo.ristorante.domain.Address();

            indirizzo.setId(add.getId());
            indirizzo.setStreetName(add.getStreetName());
            indirizzo.setStreetNumber(add.getStreetNumber());

            servizioAddress.inserisciAddress(indirizzo);
            mv.addObject("indirizzo",add);
            return mv;
    }
   

}