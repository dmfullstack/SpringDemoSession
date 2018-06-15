package com.stackroute.demosession;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.stackroute")
//@ComponentScans(value="com.stackroute")
public class EmployeeTest {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.stackroute");
		context.refresh();
		//Employee emp = new Employee();
		Employee emp = (Employee) context.getBean("employee");
		Address addr = (Address) context.getBean("address");
		emp.setId(100);
		emp.setName("Dinesh");
		addr.setCity("Sangli");
		System.out.println("Employee & Address successfully created");
		System.out.println("Employee:" + emp);
		System.out.println("Address:" + addr);
		System.out.println("Employee:Address:"+emp.getAddress());
		
	}
}
