package com.youtube.trainingClt.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.naming.NamingException;

import org.junit.jupiter.api.Test;

import com.youtube.traningEjb.Domain.Student;





class StudentServiceTest {

	@Test
	void test() throws NamingException   {
		Student student=new Student();
		student.setId("idStudent1");
		student.setName("name1");
		student.setEmail("email1");
		Locator.invoke(student);
	
}}