package app.core.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Entry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String word;
	@Column(nullable = false)
	private String definition;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "entry_id") // owner of one to many unidirectional relationship
	private List<Sentence> sentenceExamples;  
	
	public Entry() {
	}

	public Entry(String word, String definition) {
		super();
		this.word = word;
		this.definition = definition;
	}

	public Entry(int id, String word, String definition) {
		super();
		this.id = id;
		this.word = word;
		this.definition = definition;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public List<Sentence> getSentences() {
		return sentenceExamples;
	}

	public void setSentences(List<Sentence> sentences) {
		this.sentenceExamples = sentences;
	}

	@Override
	public String toString() {
		return "Entry [id=" + id + ", word=" + word + ", definition=" + definition + "]";
	}
	
	

}
