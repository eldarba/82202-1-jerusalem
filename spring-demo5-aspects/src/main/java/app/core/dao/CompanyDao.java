package app.core.dao;

import org.springframework.stereotype.Component;

import app.core.beans.Company;

@Component
public class CompanyDao {

	public int addCompany(int id, String name) {
		System.out.println("company " + id + " added");
		return id;
	}

	public int addCompany(Company company) {
		System.out.println(company + " added");
		return company.getId();
	}

	public void sayHello() {
		System.out.println("hello from companyDao");
	}

}
