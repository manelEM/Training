package com.youtube.trainingWeb.ctrl;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.SelectEvent;

import com.youtube.traningEjb.Domain.Student;
import com.youtube.traningEjb.Service.StudentServiceLocal;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class StudentCtrl {
	
	
	@EJB	
	StudentServiceLocal studentService;
	
	private Student student=new Student();
	
	public void onRowSelect(SelectEvent event)
	{
		student=(Student) event.getObject();
	}
	
	public String registerStudent()
	{
		
		studentService.addStudent(student);	
		student=new Student();
		return null;
	}
	 public List<Student>getAllStudent()
	 {
		 return studentService.getAllStudent();
	 }
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	

}
