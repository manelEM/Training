package com.youtube.traningEjb.Service;

import java.util.List;

import com.youtube.traningEjb.Domain.Student;

public interface StudentService {

	void addStudent(Student student);
	void deleteStudent(Student student);
	List<Student> getAllStudent();

}
