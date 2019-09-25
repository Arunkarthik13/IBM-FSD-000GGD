package com.Jtemplte.Spring_Jtemplate_4_9_19;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Jtemplte.Spring_Jtemplate_4_9_19.bean.Employee;
import com.Jtemplte.Spring_Jtemplate_4_9_19.bean.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
      EmployeeDao emp=context.getBean("eDao",EmployeeDao.class);
      List<Employee> list=emp.getAllEmployee();
      for(Employee e:list)
		{
			System.out.printf("\n%d\t%s\t%s\t%s",e.getId(),e.getFname(),e.getLname()
					,e.getEmail());
		}
      emp.deleteEmployee(35);
    }
}