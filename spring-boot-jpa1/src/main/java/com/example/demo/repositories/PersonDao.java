package com.example.demo.repositories;

import java.util.List;

import com.example.demo.entities.Person;

public interface PersonDao {

	int save(Person person);

	Person find(int personId);

	List<Person> findAll();

	void update(Person person);

	boolean delete(int personId);

}
