package corso.jms.mdb.demo.server.listeners;

import java.util.Date;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import corso.jms.mdb.demo.server.model.TicketRDA;

/**
 * Message-Driven Bean implementation class for: DemoQueueMDB
 *
 */
@MessageDriven(
		activationConfig = { 
				@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"), 
				@ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/testQueue"),
		}
)
public class DemoQueueMDB implements MessageListener {

    
	@PersistenceContext(unitName="OrdiComputers")
	EntityManager em;
	
    public void onMessage(Message message) {
        // TODO Auto-generated method stub
    	
    	try {
    		ObjectMessage messaggio = (ObjectMessage)message;
    		TicketRDA msg = (TicketRDA) messaggio.getObject();
            Date adesso = new Date();
            System.out.println("[MDB-Queue]: Ricevuto Messaggio:"+ adesso.toString());
            System.out.println("[MDB-Queue]: inizio elaborazione messaggio: ...");
            
            em.persist(msg);
            
            System.out.println("[MDB-Queue]: elaborazione messaggio:  conclusa");
            
            
    	}catch (Exception e){
    		System.out.println("Errore sul server");
    		e.printStackTrace();
    	}
        
    }

}
