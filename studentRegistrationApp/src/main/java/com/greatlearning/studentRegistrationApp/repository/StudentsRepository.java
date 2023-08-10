package com.greatlearning.studentRegistrationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.studentRegistrationApp.entity.Student;

public interface StudentsRepository extends JpaRepository<Student, Integer> {

}
