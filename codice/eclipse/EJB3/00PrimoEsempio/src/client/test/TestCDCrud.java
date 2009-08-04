package client.test;

import java.io.FileInputStream;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.rmi.PortableRemoteObject;

import server.sessions.CdSessionBean;
import server.sessions.CdSessionRemote;
import beans.CD;


public class TestCDCrud {

	/**
	 * @param args
	 */
	
	
	
	
	public static void main(String[] args) {
		try{
	
			
		CD nuovo = new CD();
		//nuovo.setPrimaryKey(12L);
		nuovo.setArtist("Beatles");
		nuovo.setCompany("EMI");
		nuovo.setCountry("UK");
		nuovo.setPrice(10.90);
		nuovo.setQuantity(10);
		nuovo.setTitle("Abbey Road");
		nuovo.setYear(1967);
		
		//recupero oggetto remoto:
		
		InitialContext jndiContext = new InitialContext();
        Object ref = jndiContext.lookup("CdSessionBean/remote");
        CdSessionRemote servizioCd = (CdSessionRemote)ref;
		
      servizioCd.insertCd(nuovo);
      CD refNuovo = servizioCd.findCD(12L);
		
      nuovo.setArtist("Bob Dylan");
      servizioCd.updateCD(nuovo);
       	
		
		
		
		}catch (Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
		
    
	


}
