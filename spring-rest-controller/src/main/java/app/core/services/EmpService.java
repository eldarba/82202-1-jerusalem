package app.core.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Employee;
import app.core.exceptions.EmployeeException;
import app.core.repos.EmpRepo;

@Service
@Transactional
public class EmpService {

	@Autowired
	private EmpRepo empRepo;

	public long addEmployee(Employee employee) {
		this.empRepo.save(employee);
		return employee.getId();
	}

	public Employee getEmployee(long id) {
//		return this.empRepo.findById(id).orElse(null);
		Optional<Employee> opt = this.empRepo.findById(id);
//		if (opt.isPresent()) {
//			return opt.get();
//		} else {
//			return null;
//		}
		// ternary operator
		return opt.isPresent() ? opt.get() : null;
	}

	public Employee getEmployee2(long id) throws EmployeeException {
		Optional<Employee> opt = this.empRepo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new EmployeeException("employe with id " + id + " not found");
		}
	}

	public List<Employee> getAllEmps() {
		return this.empRepo.findAll();
	}

	public void updateEmployee(Employee employee) throws EmployeeException {
		Employee empFromDb = this.getEmployee(employee.getId());
		if (empFromDb != null) {
			empFromDb.setName(employee.getName());
			empFromDb.setRole(employee.getRole());
		} else {
			throw new EmployeeException("updateEmployee failed - not found");
		}
	}

	public boolean deleteEmployee(long id) {
		Employee empFromDb = this.getEmployee(id);
		if (empFromDb != null) {
			this.empRepo.delete(empFromDb);
			return true;
		}
		return false;
	}

}
