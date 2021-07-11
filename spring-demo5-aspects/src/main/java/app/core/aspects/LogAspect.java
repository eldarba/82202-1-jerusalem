package app.core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Before("execution(* *.*(..))")
	public void logAll() {
		System.out.println(">>> Log Before Any Method");
	}

	@Before("execution(int app.core.dao.CompanyDao.addCompany(int, String))")
	public void logOnAddCompany() {
		System.out.println(">>> Log Before AddCompany");
	}

	@Before("execution(int add*(app.core.beans.Company))")
	public void logOnAddCompanyObject() {
		System.out.println(">>> Log Before AddCompany Object");
	}

	@Before("execution(* app.core.dao.*.*(..))")
	public void logOnAllMethodsInPackage() {
		System.out.println(">>> Log Before method in package: app.core.dao");
	}

}
