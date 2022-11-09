package com.curriculum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curriculum.entities.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	
}
