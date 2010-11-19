package corsi.spring.mvc.demo.servizi;

import java.util.List;

import corsi.spring.mvc.demo.dao.exception.DaoException;
import corsi.spring.mvc.demo.domain.CD;

public interface ServizioHome {

	public List<CD> getCDInOfferta() throws DaoException;

	
}
