package com.company;

import java.sql.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.company.beans.Employee;
import com.company.beans.Job;
import com.company.repo.EmployeeRepository;
import com.company.repo.JobRepository;

@SpringBootApplication
public class CompanyApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(CompanyApplication.class, args);
		
		Company company=ctx.getBean(Company.class);
		List<Employee> emps=company.getEmployees();
		emps.forEach(System.out::println);
		
		emps=company.getEmployee("Employee 1");
		emps.forEach(System.out::println);
		
		List<Job> jobs=company.getJobs(new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()+1000000000));
		jobs.forEach(System.out::println);
		
		jobs=company.getJobs(new Date(System.currentTimeMillis()));
		jobs.forEach(System.out::println);
		
		jobs=company.getJobs();
		jobs.forEach(System.out::println);
	}

}
