package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.entities.University;
import com.example.demo.repositories.StudentRepository;
import com.example.demo.repositories.UniversityRepository;

@Service
@Transactional
public class AdminService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private UniversityRepository universityRepository;

	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	public University addUniversity(University university) {
		return universityRepository.save(university);
	}

}
