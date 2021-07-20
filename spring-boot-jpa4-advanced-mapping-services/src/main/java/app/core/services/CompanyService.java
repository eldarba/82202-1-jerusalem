package app.core.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import app.core.entities.Company;
import app.core.entities.Coupon;
import app.core.repositories.CompanyRepository;
import app.core.repositories.CouponRepository;

@Service
@Scope("prototype")
@Transactional
public class CompanyService {

	private int companyId;

	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private CouponRepository couponRepository;

	public void addCompany(Company company) {
		companyRepository.save(company);
	}

	public Company getCompany(int companyId) {
		Optional<Company> opt = companyRepository.findById(companyId);
		return opt.orElse(null);
	}

	public List<Coupon> getCompanyCoupons() {
		// add derived method in the appropriate repository to get the company coupons
		// or use the company
		return null;
	}

}
