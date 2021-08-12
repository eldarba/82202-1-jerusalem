package app.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Sentence;

public interface SentenceDao extends JpaRepository<Sentence, Integer> {

}
