package corso.jms.basic.consumer;

import java.util.Properties;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class JmsDurableTopicConsumer {

	private Topic destination;
	private TopicConnectionFactory topicConnectionFactory;
	private TopicConnection topicConnection;
	
	
	public static String DESTINATION="topic/testTopic";
	

	private static Context getInitialContext(){
		Properties properties = new Properties();
		properties.put(Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
		properties.put(Context.PROVIDER_URL, "jnp://localhost:1199");
		InitialContext jndiContext = null;
		try{
			// Get an initial context
		   jndiContext = new InitialContext(properties);       		      
		}catch(NamingException e){
			System.out.println("Context Error: "+e.getMessage());
		}
		return jndiContext;
	}
	
	
	public JmsDurableTopicConsumer() throws NamingException, JMSException{
		
		
		Context JbossContext = getInitialContext();
		topicConnectionFactory = (TopicConnectionFactory) JbossContext.lookup("ConnectionFactory");			
		destination =(Topic)JbossContext.lookup(JmsDurableTopicConsumer.DESTINATION);
		topicConnection =topicConnectionFactory.createTopicConnection("john","needle");
	
	}
	
	
	 
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JmsDurableTopicConsumer consumer;
		try {
			consumer = new JmsDurableTopicConsumer();
			consumer.receiveTextMessage();
			
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}


	public boolean receiveTextMessage(){
		
		TopicSession sessione= null;
		
		try{
			
			topicConnection.start();
			sessione = topicConnection.createTopicSession(false,Session.AUTO_ACKNOWLEDGE );
			TopicSubscriber subscriber= sessione.createDurableSubscriber(destination,"topic1");
			
			System.out.println("In attesa di ricevere messaggio..");
			
			Message message = subscriber.receive(10000);
		
			if (message != null) {
				System.out.println("Trovato un messaggio!!...");
				if (message instanceof TextMessage) {
					TextMessage textMessage = (TextMessage) message;
					System.out.println(textMessage.getText());
				}
			}
	    }	    
	    catch (JMSException e) {
	      System.out.println("JMS Exception "+e.getMessage());
	      return false;
	    }	    
	    return true;
	}


	

}
