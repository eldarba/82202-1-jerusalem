package app.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Entry;

public interface EntryDao extends JpaRepository<Entry, Integer> {

}
