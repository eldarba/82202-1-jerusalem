package app.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long> {

}
