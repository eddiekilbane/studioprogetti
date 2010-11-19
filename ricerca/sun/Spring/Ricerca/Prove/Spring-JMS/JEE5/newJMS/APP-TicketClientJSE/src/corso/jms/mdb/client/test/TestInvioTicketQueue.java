package corso.jms.mdb.client.test;

import java.io.Serializable;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import corso.jms.mdb.demo.server.model.TicketRDA;





public class TestInvioTicketQueue {

	
	static final String DESTINATION = "queue/testQueue";
	
	private QueueConnection queueConnection;
	private QueueConnectionFactory qcf;
	private QueueSession queueSession;
	private Queue queueReference;
	private QueueSender sender;
	
	
	private Context getInitialContext(){
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
	
	
	public TestInvioTicketQueue(){
		try{
			//Riferimento al servizio JNDI
			Context context = getInitialContext(); 
			
			//Ottengo un factory per la costruzione di una queue connection
			qcf = (QueueConnectionFactory) context.lookup("QueueConnectionFactory");	
			
			//Ottengo un riferimento alla destination
			 queueReference = (Queue)context.lookup(TestInvioTicketQueue.DESTINATION);
			 
			//Ottengo una connessione ad una destination di tipo queue
			queueConnection = qcf.createQueueConnection();
						
			queueSession = queueConnection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
						
			//Creo un producer che spedirà messaggi su queue/testQueue
			sender = queueSession.createSender(queueReference);			
		}
		catch (NamingException e) {
			System.out.println("Naming Exception "+e.getMessage());
		}
		catch (JMSException e) {
			System.out.println("JMS Exception "+e.getMessage());
		}		
	}
	
	public boolean sendObjectMessage(Serializable obj){
		try{			
			queueConnection.start();
			//Creo un messaggio 
			ObjectMessage message = queueSession.createObjectMessage();
			message.setObject(obj);
			//Spedisco
			sender.send(message);
			//System.out.println("Message sent.");
		}catch (JMSException e) {
			System.out.println("JMS Exception "+e.getMessage());
			return false;
		}
		return true;
		
	}
	
public static void testSendMessages (int quanti){
		
	TestInvioTicketQueue ms = new TestInvioTicketQueue();
		
		Random rnd = new Random();
				
		for (int i=0;i<quanti;i++){
			
			int secondi =rnd.nextInt(3000);
			
			try {
				Thread.sleep(secondi);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			TicketRDA nuovoTicket = new TicketRDA();
			nuovoTicket.setDescrizioneProblema("problema "+i);
			nuovoTicket.setDataAcquisto(new Date(110,3,4));
			nuovoTicket.setModello("Asus "+i);
			nuovoTicket.setNumeroDocumentoAcquisto("ADBN34234"+i+"23"+i+"435"+i);
			nuovoTicket.setNumeroMatricola("1234242"+i);
			
			boolean sent = ms.sendObjectMessage(nuovoTicket);
			
			if(sent)
				System.out.println("Messaggio spedito "+i);
			else
				System.out.println("Problemi di connessione");	
		}
		
		
		ms.closeCommunication();
		
	}
	
	
	
	
	public static void main(String[] args) {

	
		testSendMessages(30);
		

	

	}
	
	public void closeCommunication(){
		if (queueConnection != null && queueSession != null) {
			try {
				queueSession.close();
				queueConnection.close();
			}
			catch (JMSException e) {
				
			}
		}
	}
	
	
	
}
