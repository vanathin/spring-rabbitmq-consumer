package com.learning.springrabbitmqconsumer.bean;


public class Employee {
    public Employee() {

    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    private Integer empId;

    @Override
    public String
    toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                '}';
    }
}
