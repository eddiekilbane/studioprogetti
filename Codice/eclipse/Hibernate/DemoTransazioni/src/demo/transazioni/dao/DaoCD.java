package demo.transazioni.dao;

import java.util.Vector;

import demo.transazioni.beans.CD;

public class DaoCD {

	
	public Vector<CD> retrieveCD (CD daCercare){
		Vector <CD> lista = new Vector<CD>();
		
		CD trovato = new CD();
		trovato.setArtist("Bob Dylan");
		trovato.setTitle("Empire Burlesque");
		trovato.setCompany("RCA");
		trovato.setPrice(10.90);
		trovato.setYear(1966);
		trovato.setCountry("USA");
		trovato.setQuantity(12);
		
		lista.add(trovato);
		
		return lista;
		
		
	}


	public void updateCD(CD daModificare) {

	}





}
