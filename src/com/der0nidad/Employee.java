package com.der0nidad;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private int salary;

    public Employee(){}

    public Employee(String firstName, String lastName, String position, int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return (this.position + " " + this.getFirstName() + " " + this.getLastName() + " with salary " + this.salary);
    }
}
