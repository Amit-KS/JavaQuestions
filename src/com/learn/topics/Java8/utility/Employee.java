package com.learn.topics.Java8.utility;

public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private int salary;

    public int getId() {
        return id;
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int compareTo(Employee p) {
        if(this.id > p.id) { // performing comparison
            return 1;
        } else {
            return -1;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
