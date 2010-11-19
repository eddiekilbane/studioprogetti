package corsi.spring.mvc.demo.dao;

import java.util.List;

import corsi.spring.mvc.demo.dao.exception.DaoException;
import corsi.spring.mvc.demo.domain.CD;

public interface DaoCD {
	
	public List<CD> queryCD(String query) throws DaoException;
}
