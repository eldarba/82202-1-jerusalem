package app.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Employee;
import app.core.exceptions.EmployeeException;
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
	public Employee getEmployee(@RequestParam("empId") long id) {
		return this.empService.getEmployee(id);
	}

	@GetMapping("/get-one")
	public ResponseEntity<?> getEmployee2(@RequestParam("empId") long id) {
		Employee employee = this.empService.getEmployee(id);
		if (employee != null) {
			return ResponseEntity.ok(employee);
//			return ResponseEntity.status(HttpStatus.OK).body(e);
		} else {
			// a ResponseEntity<Employee> is not a ResponseEntity<String>
			// therefore we cannot return a text message
//			return ResponseEntity.notFound().build();
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT FOUND");
		}
	}

	@GetMapping("/find-one")
	public Employee getEmployee3(@RequestParam("empId") long id) {
		try {
			Employee employee = this.empService.getEmployee2(id);
			return employee;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
		}
	}

	// url: http://localhost:8080/api/employee/add
	// body: {"name":"John", "role":"Manager"}
	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public long addEmployee(@RequestBody Employee emp) {
		return this.empService.addEmployee(emp);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee) {
		try {
			this.empService.updateEmployee(employee);
			return ResponseEntity.ok("update success");
//			return ResponseEntity.status(HttpStatus.OK).body("update success");
		} catch (EmployeeException e) {
//			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@DeleteMapping("/delete/{id}")
	public boolean deleteEmployee(@PathVariable long id) {
		return this.empService.deleteEmployee(id);
	}

}
