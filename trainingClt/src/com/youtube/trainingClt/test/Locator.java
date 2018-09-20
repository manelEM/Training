package com.youtube.trainingClt.test;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.youtube.traningEjb.Domain.Student;
import com.youtube.traningEjb.Service.StudentService;
import com.youtube.traningEjb.Service.StudentServiceImpl;

public class Locator {
	
	static void invoke(Student student) throws NamingException 
	{
		final StudentService studentService=lookUp();
		studentService.addStudent(student);
	}

	private static StudentService lookUp() throws NamingException {
		Hashtable<Object, Object> jndiProperties=new Hashtable<>();
		//jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory"); 
		jndiProperties.put(Context.PROVIDER_URL,"http-remoting://localhost:8080");
		final Context context=new InitialContext(jndiProperties);
		final String appName="";
		final String moduleName="trainingEjb";
		final String distinctName="";
		final String beanName=StudentServiceImpl.class.getSimpleName();
		final String viewClassName=StudentService.class.getName();
		return ((StudentService) context.lookup("ejb:"+appName+"/"+moduleName+"/"+distinctName+"/"+beanName+"!"+viewClassName));
	
	}				
}
