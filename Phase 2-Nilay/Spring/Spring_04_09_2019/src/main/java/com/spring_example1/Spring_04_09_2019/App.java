package com.spring_example1.Spring_04_09_2019;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_example1.Spring_04_09_2019.bean.Coach;
import com.spring_example1.Spring_04_09_2019.bean.Employee;

public class App 
{
    public static void main( String[] args )
    {   try {
    	
//    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext1.xml");
//    	Coach myCoach =context.getBean("theEmployee", Employee.class);
//        System.out.println( myCoach.getStudentDetail() );
    	ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("ApplionContext2.xml");
    	Coach myCoach =con.getBean("theEmployee", Employee.class);
    	System.out.println(myCoach.getStudentDetail()+" "+myCoach.getAddressService());
    }
    catch(Exception e)
    {
    	System.out.println(e);
    }
    }
}
 