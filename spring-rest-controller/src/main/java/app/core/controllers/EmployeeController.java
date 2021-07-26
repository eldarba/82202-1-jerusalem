package app.core.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.Employee;
import app.core.services.EmpService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	private EmpService empService;

	public EmployeeController(EmpService empService) {
		super();
		this.empService = empService;
	}

	// map this method so it has a URL
	@GetMapping(path = "/all", produces = { "application/json", "application/xml" })
	public List<Employee> getEmployees() {
		return this.empService.getAllEmps();
	}

	@GetMapping("/one")
	public Employee getEmployee(@RequestParam long id) {
		return this.empService.getEmployee(id);
	}

	// url: http://localhost:8080/api/employee/add
	// body: {"name":"John", "role":"Manager"}
	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public long addEmployee(@RequestBody Employee emp) {
		return this.empService.addEmployee(emp);
	}

}
