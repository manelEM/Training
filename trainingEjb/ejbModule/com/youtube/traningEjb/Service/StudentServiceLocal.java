package com.youtube.traningEjb.Service;

import java.util.List;

import javax.ejb.Local;

import com.youtube.traningEjb.Domain.Student;



@Local
public interface StudentServiceLocal {
	void addStudent(Student student);
	void deleteStudent(Student student);
	List<Student> getAllStudent();


}
