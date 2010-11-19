package corso.jms.mdb.demo.server;

import java.util.Date;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

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

    
	
	
    public void onMessage(Message message) {
        // TODO Auto-generated method stub
    	
    	try {
            TextMessage msg = (TextMessage) message;
            Date adesso = new Date();
            System.out.println("[MDB-Queue]: Ricevuto Messaggio:" + msg.getText()+ adesso.toString());
            System.out.println("[MDB-Queue]: inizio elaborazione messaggio: "+ msg.getText());
            
            //TODO Thread.sleep()..
            Thread.sleep(5000);
            
            System.out.println("[MDB-Queue]: elaborazione messaggio: "+ msg.getText()+" conclusa");
            
            
    	} catch (JMSException ex) {
            ex.printStackTrace();
        } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

}
