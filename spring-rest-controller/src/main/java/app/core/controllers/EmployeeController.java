package app.core.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.Employee;
import app.core.services.EmpService;

@RestController
public class EmployeeController {

	private EmpService empService;

	public EmployeeController(EmpService empService) {
		super();
		this.empService = empService;
	}

	// map this method so it has a URL
	@RequestMapping(method = RequestMethod.GET, path = "/a", produces = MediaType.APPLICATION_XML_VALUE)
	public List<Employee> getEmployees() {
		return this.empService.getAllEmps();
	}

}
