package business;

import java.sql.SQLException;
import java.util.Vector;
import model.Cd;
import dao.DaoCd;

public class Operazioni {

	
	public Operazioni(){
				
	}
	
	public Vector <Cd> getCatalogo() throws ClassNotFoundException, SQLException{
		
		Vector <Cd> catalogo;
		
		DaoCd CdPersistenza = new DaoCd("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/negoziocd","root","stefano");
		catalogo= CdPersistenza.getCatalogoCd();
		CdPersistenza.chiudiConn();
		return catalogo;
		
	}
	
}
