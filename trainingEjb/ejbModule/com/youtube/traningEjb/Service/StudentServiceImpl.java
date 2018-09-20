package com.youtube.traningEjb.Service;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.youtube.traningEjb.Domain.Student;





@Stateless
@Remote(StudentService.class)
public class StudentServiceImpl implements StudentService,StudentServiceLocal {
	
	
	
	@PersistenceContext	
	EntityManager entityManager;
	
	@Override
	public void addStudent(Student student)
	{
		entityManager.persist(student);
	}
	
	@Override
	public void deleteStudent(Student student)
	{
		entityManager.remove(entityManager.merge(student));
	}
	

	@Override
	public List<Student> getAllStudent()
	{
		Query query=entityManager.createQuery("select s from Student s");
		return query.getResultList();
	}
	

}
