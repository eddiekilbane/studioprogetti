package corsi.applicazioni.blog.dao.impl;

import java.io.Serializable;

import corsi.applicazioni.blog.dao.DaoException;
import corsi.applicazioni.blog.dao.GenericDao;

public class GenericDaoImpl implements GenericDao{

	@Override
	public <T> void delete(T persistentObject) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T, PK extends Serializable> T getEntity(Class<T> newInstance, PK id)
			throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T insert(T newInstance) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T update(T transientObject) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
