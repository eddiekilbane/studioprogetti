package corso.jms.mdb.demo.server.listeners;

import java.util.Date;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Message-Driven Bean implementation class for: DemoTopicMDB
 *
 */
@MessageDriven(
		activationConfig = { 
				@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
				@ActivationConfigProperty(propertyName = "destination", propertyValue = "topic/testTopic")
		}
)
public class DemoTopicMDB implements MessageListener {

    /**
     * Default constructor. 
     */
    public DemoTopicMDB() {
        // TODO Auto-generated constructor stub
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {

    	
    	try {
            TextMessage msg = (TextMessage) message;
            Date adesso = new Date();
            System.out.println("[MDB-Topic]: Ricevuto Messaggio:" + msg.getText()+ adesso.toString());
            System.out.println("[MDB-Topic]: inizio elaborazione messaggio: "+ msg.getText());
            
            Thread.sleep(5000);
            
            System.out.println("[MDB-Topic]: elaborazione messaggio: "+ msg.getText()+" conclusa");
            
            
    	} catch (JMSException ex) {
            ex.printStackTrace();
        } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	
    	
        
    }

}
