package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString.Exclude;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	private Integer id;
	@NonNull
	private String name;
	@NonNull
	private String country;
	@Exclude
	@OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
	private List<Student> students;

	public void addStudent(Student student) {
		if (this.students == null) {
			this.students = new ArrayList<>();
		}
		student.setUniversity(this);
		this.students.add(student);
	}

}
