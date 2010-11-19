package corsi.applicazioni.blog.dao;

import java.io.Serializable;

import corsi.applicazioni.blog.domain.AbstractValueObject;

public interface GenericDao {

	public <T> T insert(T newInstance) throws DaoException;
	
	public <T> T update(T transientObject) throws DaoException;
	
	public <T> void delete(T persistentObject) throws DaoException;
	
	public <T, PK extends Serializable> T getEntity(Class<T> newInstance, PK id) throws DaoException;
	
}
