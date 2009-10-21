package server.sessions;

import javax.ejb.Remote;

import beans.CD;

@Remote
public interface CdSessionRemote {

	
	public void insertCd(CD nuovo);
	public CD findCD(Long pKey);
	public void updateCD(CD daModificare);
	public void deleteCD(CD daCancellare);
}
