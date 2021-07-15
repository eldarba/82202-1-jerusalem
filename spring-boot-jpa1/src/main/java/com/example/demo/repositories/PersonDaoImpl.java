package com.example.demo.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Person;

@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {

	// like @Autowired but for any Persistence Context (entities container)
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public int save(Person person) {
		entityManager.persist(person); // save the person to the database
		return person.getId();
	}

	@Override
	public Person find(int personId) {
		return entityManager.find(Person.class, personId);
	}

	@Override
	public void update(Person person) {
		Person personFromDb = find(person.getId());
		if (personFromDb != null) {
			// if we are here than we have a persistent entity
			personFromDb.setAge(person.getAge());
			personFromDb.setName(person.getName());
		} else {
			System.out.println("NOT Updated - not found");
		}
	}

	@Override
	public boolean delete(int personId) {
		Person personFromDb = find(personId);
		if (personFromDb != null) {
			// if we are here than we have a persistent entity
			entityManager.remove(personFromDb);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Person> findAll() {
		TypedQuery<Person> query = entityManager.createQuery("from Person", Person.class);
		return query.getResultList();
	}

}
