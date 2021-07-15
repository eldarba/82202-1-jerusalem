package com.example.demo.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	private Integer id;
	@NonNull
	private String name;
	@NonNull
	private Integer age;
	@NonNull
	private String email;
	@NonNull
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@NonNull
	private LocalDate enrolDate;
	@NonNull
	private Boolean active;
	@ManyToOne
	private University university;

	public enum Gender {
		MALE, FEMALE;
	}

}
