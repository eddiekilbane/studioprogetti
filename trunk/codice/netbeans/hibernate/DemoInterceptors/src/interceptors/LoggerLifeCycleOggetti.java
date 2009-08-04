/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interceptors;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.hibernate.EmptyInterceptor;
import org.hibernate.Transaction;
import org.hibernate.type.Type;

/**
 *
 * @author stefano
 */
public class LoggerLifeCycleOggetti extends EmptyInterceptor{


    static{
        log4JLogger= Logger.getLogger(LoggerLifeCycleOggetti.class.getName());

    }

    static Logger log4JLogger;





    @Override
    public void afterTransactionBegin(Transaction tx) {
        log4JLogger.info("afterTransactionBegin");
    }

    @Override
    public void afterTransactionCompletion(Transaction tx) {
        log4JLogger.info("afterTransactionCompletion\n***********************************");
    }

    @Override
    public void beforeTransactionCompletion(Transaction tx) {
        log4JLogger.info("beforeTransactionCompletion\n***********************************");
    }

    @Override
    public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        String now = getFormattedDateNow();
        log4JLogger.info(now);
        log4JLogger.info("Richiesta cancellazione per l'oggetto ");
        log4JLogger.info(entity);

    }

    @Override
    public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
       
        String now = getFormattedDateNow();
        log4JLogger.info(now);
        log4JLogger.info("\n********************************************");
        log4JLogger.info("Caricato oggetto con Id: "+id);
        logAction(entity, id, state, propertyNames, types);
        log4JLogger.info("\n********************************************");
        return true;

    }

    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        log4JLogger.info("Salvato oggetto con Id: "+id);
        log4JLogger.info("\n********************************************");
        logAction(entity, id, state, propertyNames, types);
        log4JLogger.info("\n********************************************");
        return true;
    }

    @Override
    public void postFlush(Iterator entities) {
        super.postFlush(entities);
    }

    @Override
    public void preFlush(Iterator entities) {
        super.preFlush(entities);

    }






    private String getFormattedDateNow(){

        Calendar now = Calendar.getInstance();
        String dayFormat=String.format("%1$td-%1$tm-%1$tY", now);
        String time = String.format("%1$tH:%1$tM:%1$tS", now);
        return dayFormat+" "+time;

    }


    private void logAction(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types){

     
        

        for (int i =0; i<state.length; i++){
           log4JLogger.info("Proprieta': "+propertyNames[i]);
           log4JLogger.info("valore: "+state[i].toString());
           log4JLogger.info("di tipo: "+types[i].getName()+"\n");
        }
        
        


    }

}
