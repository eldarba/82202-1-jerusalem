package app.core;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import app.core.entities.Employee;
import app.core.services.EmpService;

@Configuration
public class Config {

//	@Bean
	public CommandLineRunner populateDB(EmpService empService) {
		CommandLineRunner runner = new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				empService.addEmployee(new Employee("Dan", "Lawer"));
				empService.addEmployee(new Employee("Dafna", "Teacher"));
				empService.addEmployee(new Employee("Oren", "Salesman"));
				empService.addEmployee(new Employee("Moshe", "Lawer"));
			}
		};

		return runner;
	}

}
