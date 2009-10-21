package demo.transazioni.servizio;

import java.util.Vector;

import demo.transazioni.beans.CD;
import demo.transazioni.dao.DaoCD;

public class ServiziCd {

	
	public Vector<CD> cerca (CD daCercare){
		Vector <CD> lista;
		DaoCD daoCD = new DaoCD();
		lista = daoCD.retrieveCD(daCercare);
		return lista;
	}
	
	
	public void updateCd (CD daModificare){
		DaoCD daoCD = new DaoCD();
		
		
	}
	
}
