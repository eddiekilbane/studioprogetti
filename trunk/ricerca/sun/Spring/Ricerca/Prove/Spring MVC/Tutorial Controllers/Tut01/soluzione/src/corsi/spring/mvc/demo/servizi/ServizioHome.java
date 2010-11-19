package corsi.spring.mvc.demo.servizi;

import java.util.List;


import corsi.spring.mvc.demo.domain.CD;
import corsi.spring.mvc.demo.servizi.exception.ServiziException;

public interface ServizioHome {

	public List<CD> getCDInOfferta() throws ServiziException;

	
}
