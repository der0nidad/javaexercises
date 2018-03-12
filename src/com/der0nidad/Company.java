package com.der0nidad;

import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;
public class Company {
    private LinkedList<Employee> lisOfEmployees;

    Company(){
        lisOfEmployees = new LinkedList<>();
    }

    public boolean isNotEmpty(){
        return lisOfEmployees.size() > 0 ;
    }
    public  LinkedList<Employee> input(){
        Scanner in = new Scanner(System.in);
        char inputFlag;
        Employee emp;
        System.out.println("Do you want to enter smth?, [y/n]. Use space as delimeter.");
        inputFlag = in.next("\\w{1,1}").charAt(0);
        if(inputFlag != 'y'){
            return lisOfEmployees;
        }
        while(inputFlag == 'y'){
            emp = new Employee();
            System.out.println("Enter firstname:");
            if (in.hasNext()){
                emp.setFirstName(in.next());
            }
            System.out.println("Enter lastname:");
            if(in.hasNext()) {
                emp.setLastName(in.next());
            }
            System.out.println("Enter position:");
            if(in.hasNext()){
                emp.setPosition(in.next());
            }
            System.out.println("Enter salary:");
            if(in.hasNextInt()){
                emp.setSalary(in.nextInt());

            }
            lisOfEmployees.add(emp);
            emp = null;
            System.out.println("Do you want to continue input? [y/n]");
            inputFlag = in.next("\\w{1,1}").charAt(0);
            if(inputFlag != 'y'){
                break;
            }
            in.reset();
        }
        return lisOfEmployees;

    }
    /*Sorts list in ascending order*/
    public  LinkedList<Employee> sortBySalary(){
        Collections.sort(lisOfEmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.compareTo(o2);
            }
        });
        return  lisOfEmployees;
    }
    /*Prints all employees*/
    public  void   print(){
        System.out.println("List of employees: ");
        for(Employee s : lisOfEmployees){
            System.out.println(s.toString());
        }
    }

    public  LinkedList<Employee> findByPosition( String reqPos){
        LinkedList<Employee> res = new LinkedList<Employee>();
        for (Employee e :
                lisOfEmployees) {
            if (reqPos.equals(e.getPosition()))   {
                res.add(e);
            }
        }
        return  res;
    }
}
