package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.University;

public interface UniversityRepository extends JpaRepository<University, Integer> {

}
