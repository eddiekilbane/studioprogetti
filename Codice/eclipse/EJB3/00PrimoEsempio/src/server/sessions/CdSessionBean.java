package server.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.FlushModeType;


import beans.CD;


@Stateless
public class CdSessionBean implements CdSessionRemote{

	
	
	@PersistenceUnit(unitName = "esempioCD")
	private EntityManagerFactory factory;
	
	@PersistenceContext(unitName = "esempioCD")
	private EntityManager manager;

	public void insertCd(CD nuovo) {
		manager.persist(nuovo);
	}

	public CD findCD(Long pKey) {
		return manager.find(CD.class, pKey);
	}

	public void updateCD(CD daModificare) {
		manager.merge(daModificare);
	}
	
	public void deleteCD(CD daCancellare){
		manager.remove(daCancellare);
	}
}
