package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Company;
import app.core.dao.CompanyDao;

public class App {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			CompanyDao companyDao = ctx.getBean(CompanyDao.class);
//			System.out.println(companyDao.getClass());
			companyDao.sayHello();
			companyDao.addCompany(101, "AAA");
			companyDao.addCompany(new Company(201, "BBB"));
		}

	}

}
