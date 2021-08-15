package com.company.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.beans.Job;

public interface JobRepository extends JpaRepository<Job,Long>{
	List<Job> findJobByEndDate(Date endDate);
	List<Job> findJobByEndDateBetween(Date startDate, Date endDate);
}
