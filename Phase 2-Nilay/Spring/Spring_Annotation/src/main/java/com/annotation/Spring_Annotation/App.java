package com.annotation.Spring_Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.Spring_Annotation.bean.Employee;
import com.annotation.Spring_Annotation.bean.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
      EmployeeDao dao=context.getBean("eDao",EmployeeDao.class);
      dao.createEmployee(new Employee(5, "karthik", "Arun", "gokul@gmail.com"));
    }
}
