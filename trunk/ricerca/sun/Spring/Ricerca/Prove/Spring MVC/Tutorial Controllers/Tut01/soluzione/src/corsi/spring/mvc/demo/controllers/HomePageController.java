package corsi.spring.mvc.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import corsi.spring.mvc.demo.domain.CD;
import corsi.spring.mvc.demo.servizi.ServizioHome;

public class HomePageController extends AbstractController{

	private ServizioHome servizioHome;
	
	
	public ServizioHome getServizioHome() {
		return servizioHome;
	}


	public void setServizioHome(ServizioHome servizioHome) {
		this.servizioHome = servizioHome;
	}

	public HomePageController(){
		this.setSupportedMethods(new String[]{METHOD_GET});
		this.setCacheSeconds(5);
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		List <CD> cdInOfferta =servizioHome.getCDInOfferta();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("offerte", cdInOfferta);
		modelAndView.setViewName("homeView");
		return modelAndView;
	}

}
