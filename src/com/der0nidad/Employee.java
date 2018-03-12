package com.der0nidad;


public class Employee implements Comparable<Employee>{
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
        return ("Employee: " + this.getFirstName() + " "
                + this.getLastName() + " on position: " + this.position  +
                ", with salary: " + this.salary);
    }



    @Override
    public int compareTo(Employee otherEmp) {
        int sal1 = salary;
        int sal2 = otherEmp.getSalary();
        return Integer.compare(sal1, sal2);
    }


}
