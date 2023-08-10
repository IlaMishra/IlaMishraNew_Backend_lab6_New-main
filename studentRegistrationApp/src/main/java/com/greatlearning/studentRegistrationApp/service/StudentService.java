package com.greatlearning.studentRegistrationApp.service;

import java.util.List;

import com.greatlearning.studentRegistrationApp.entity.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	public void save(Student Student);
	public void deleteById(int id);
	public Student findById(int id);

}
