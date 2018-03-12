package com.der0nidad;



public class Main {
    /*Fills the list of employees with data entered from the keyboard, separated by spaces*/


    public static void main(String[] args) {
        Company company = new Company();

        company.input();
        if(company.isNotEmpty()){
            company.findByPosition("Dir");
            company.print();
            company.sortBySalary();
            company.print();
        }
    }

}
