package esempio.forms;

import org.apache.struts.action.*;
import org.apache.struts.validator.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class ExampleXMLForm extends ValidatorForm {

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

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// reset properties
		name = "";
		age = 0;
	}
}


