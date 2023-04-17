package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Scope()
public class Employee {
    private long id;
    private String name;
    private double salary;
    private Department department;
    private List<Address> addresses;
    public Employee(){

    }

    public Employee(long id, String name, double salary, Department department, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.addresses = addresses;
    }

    public void printName() {
        System.out.println("Employee name is >> " + name + " and salary is >> " + salary + " and department is >> " + department.getName());
        for(Address address : addresses){
            System.out.println("Address is >> "+address.getName());
        }
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    @Required
    @Autowired
    @Qualifier("dept")
    public void setDepartment(Department department) {
        this.department = department;
    }
}
