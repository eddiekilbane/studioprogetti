package business;

import model.*;

public class OperazioniUtente {

	
	public Utente eseguiLogin (String user, String pw)throws Exception{
		
		dao.DaoUtente daoUtente = new dao.DaoUtente();
		model.Utente loggato = daoUtente.login(user, pw);
		return loggato;
		
	}
	
	
	
}
