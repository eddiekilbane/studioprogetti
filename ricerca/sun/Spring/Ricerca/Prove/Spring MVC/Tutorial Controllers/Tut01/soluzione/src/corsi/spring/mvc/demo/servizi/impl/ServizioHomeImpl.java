package corsi.spring.mvc.demo.servizi.impl;

import java.util.List;
import java.util.Vector;


import corsi.spring.mvc.demo.domain.CD;
import corsi.spring.mvc.demo.servizi.ServizioHome;
import corsi.spring.mvc.demo.servizi.exception.ServiziException;

public class ServizioHomeImpl implements ServizioHome{

	public List<CD> getCDInOfferta() throws ServiziException {

		List<CD> offerte = new Vector <CD>();
		
		CD cd1 = new CD();
		cd1.setArtist("Mino Reitano");
		cd1.setTitle("I miei successi");
		cd1.setCompany("Ricordi");
		cd1.setPrice(10.90);
		cd1.setYear(1966);
		cd1.setCountry("ITALIA");
		cd1.setQuantity(30);
		offerte.add(cd1);
		
		CD cd2 = new CD();
		cd2.setArtist("Nilla Pizzi");
		cd2.setTitle("Papaveri e Papere");
		cd2.setCompany("EMI");
		cd2.setPrice(8.90);
		cd2.setYear(1900);
		cd2.setCountry("ITALIA");
		cd2.setQuantity(3);
		offerte.add(cd2);
		
		
		CD cd3 = new CD();
		cd3.setArtist("Massimo Speranza");
		cd3.setTitle("Il nulla");
		cd3.setCompany("CDS");
		cd3.setPrice(3.90);
		cd3.setYear(2006);
		cd3.setCountry("ITALIA");
		cd3.setQuantity(12);
		offerte.add(cd3);
		
		CD cd4 = new CD();
		cd4.setArtist("Orietta Berti");
		cd4.setTitle("Le mie canzoni");
		cd4.setCompany("EMI");
		cd4.setPrice(8.40);
		cd4.setYear(2006);
		cd4.setCountry("ITALIA");
		cd4.setQuantity(5);
		offerte.add(cd4);
		
		return offerte;
		
	}

}
