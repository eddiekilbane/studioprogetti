package corsi.spring.mvc.demo.servizi.impl;

import java.util.List;

import corsi.spring.mvc.demo.dao.DaoCD;
import corsi.spring.mvc.demo.dao.exception.DaoException;
import corsi.spring.mvc.demo.domain.CD;
import corsi.spring.mvc.demo.servizi.ServizioHome;

public class ServizioHomeImpl implements ServizioHome{

	private DaoCD daoCD;
	
	public DaoCD getDaoCD() {
		return daoCD;
	}

	public void setDaoCD(DaoCD daoCD) {
		this.daoCD = daoCD;
	}

	@Override
	public List<CD> getCDInOfferta() throws DaoException {
		// TODO Auto-generated method stub
		return daoCD.queryCD("select * from cd where CD.stato='in offerta'");
	}

}
