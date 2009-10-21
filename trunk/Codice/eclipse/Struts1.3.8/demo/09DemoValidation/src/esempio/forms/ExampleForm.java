package esempio.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;



public class ExampleForm extends ActionForm {

	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		// creo una nuova istanza di actionerrors
		ActionErrors actionErrors = new ActionErrors();

		// validazione name
		if (name.length() < 3) {
			actionErrors.add("name", new ActionMessage("error.name"));
		}

		// validazione age
		if (age == null || age < 18) {
			actionErrors.add("age", new ActionMessage("error.age"));
		}

		// restituisco in ogni caso la collection
		// di errors (eventualmente vuota)
		return actionErrors;
	}

	// imposto i valori di default
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// reset properties
		name = "";
		age = 0;

	}
	
	


}
