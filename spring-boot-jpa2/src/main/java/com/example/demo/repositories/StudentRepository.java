package com.example.demo.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Student;
import com.example.demo.entities.Student.Gender;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	// add some more custom methods

	// JPQL - query for entities (class) rather than tables
	@Query("from Student where gender = 'MALE'")
	List<Student> getMales();

	// SQL - native query - tables
	@Query(value = "select * from student where gender = 'FEMALE'", nativeQuery = true)
	List<Student> getFemales();

	@Query("from Student where age > :age")
	List<Student> getOlderThan(int age);

	// derived methods
	List<Student> findByName(String name);

	List<Student> findByNameIsNot(String name);

	List<Student> findByNameIsNull();

	List<Student> findByActiveTrue();

	List<Student> findByActiveFalse();

	List<Student> findByGender(Gender gender);

	List<Student> findByNameStartingWith(String prefix);

	List<Student> findByNameEndingWith(String sufix);

	List<Student> findByNameContaining(String str);

	List<Student> findByEnrolDateAfter(LocalDate enrolDate);

	List<Student> findByEnrolDateBefore(LocalDate enrolDate);

	List<Student> findByUniversity(int universitId);

}
