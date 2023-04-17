package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) throws Exception {
        // there are two IoC containers in Spring
        // 1. Bean Factory
        // 2. Application Context

//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/home/samozain/Youtube/spring-course-noor-shaheen/dev/_01_IoC/src/main/resources/beans.xml");

//        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Department department = (Department) applicationContext.getBean("department");
        department.setName("software engineering");
        System.out.println(department.getName());

//        Employee employee = (Employee) applicationContext.getBean("emp2");
//        employee.setName("ahmed");
//        employee.setSalary(5000.22);

//        Employee employee2 = (Employee) applicationContext.getBean("emp2");
//        employee2.setName("akram");
//        employee2.setSalary(9000.33);

//        employee.printName();
//        employee2.printName();

//    ShowBeanLifeCycle beanLifeCycle = (ShowBeanLifeCycle) applicationContext.getBean("beanCycle");


//        applicationContext.registerShutdownHook();
//        applicationContext.close();
    }
}
