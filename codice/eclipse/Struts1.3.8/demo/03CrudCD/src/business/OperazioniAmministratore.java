package business;

import java.sql.SQLException;

import model.Cd;
import dao.DaoCd;

public class OperazioniAmministratore {

	
	public int inserisciCd (Cd nuovo)throws ClassNotFoundException, SQLException{
		
		int ris=0;
		
		DaoCd CdPersistenza = new DaoCd("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/negoziocd","root","stefano");
		ris=CdPersistenza.inserisciCD(nuovo);
		
		CdPersistenza.chiudiConn();
		return ris;
		
	}
	
	
	public void modificaCd(Cd aggiornato){
		
	}
	
	
	public void cancellaCd (Cd daCancellare){
		
		
	}
	
}
