package com.curriculum.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;


@Entity
@Table(name = "tb_student")
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String name;
	public Long age;
	

	@ManyToMany
	@JoinTable(name = "tb_student_subject",
			  joinColumns = @JoinColumn(name = "student_id"),
			  inverseJoinColumns = @JoinColumn(name = "subject_id"))
	Set<Subject> subjects = new HashSet<>();
	
	
	public Student(){}
	
	public Student(Long id, String name, Long age) {
		this.id = id;
		this.name = name;
		this.age = age;
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	

	// hashCode will Compare objects, but there is a small possibility that two or more objects will generate the same number
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// equals is slower than hashCode, but ensures that there is no equality

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id);
	}
	
	// So because the hashCode is faster, it is used. And, if there are identical objects, equals is used to complement

}
