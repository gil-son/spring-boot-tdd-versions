package com.curriculum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curriculum.entities.Subject;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

	
}
