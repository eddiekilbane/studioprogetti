package test;

import dao.*;
import model.*;
import java.util.Vector;


public class TestDaoCDmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			DaoCd dao = new DaoCd("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/negoziocd","root","stefano");
			
			//test recupero dati:
			Vector <Cd> v = dao.cercaPerTitolo("Empire Burlesque");
			Cd recuperato = v.get(0);
			System.out.println(recuperato);
			
			
			//TEST INSERIMENTO:
			Cd nuovo = new Cd();
			
			nuovo.setPrimary(100L);
			nuovo.setArtist("Beatles");
			nuovo.setTitle("Abbey Road");
			nuovo.setCompany("EMI");
			nuovo.setPrice(16.90);
			nuovo.setYear(1966);
			nuovo.setCountry("USA");
			nuovo.setQuantity(20);
			dao.inserisciCD(nuovo);
			
			
			
			
			
			// TEST CANCELLAZIONE:
			dao.eliminaCD(nuovo);
			
			
		}
		
		catch (Exception e){
			
			System.out.println(e);
		}
		
	}

}
