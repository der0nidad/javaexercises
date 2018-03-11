package com.der0nidad;
import java.util.*;
/*реализовать
    1. заполнение контейнера данными с клавиатуры
    2. вывод информации о сотрудниках на экран
    3. поиск сотрудников, состоящих на данной должности
    4. сортировку списка сотрудников по полю фамилия и по полю зарплата
* */
public class Main {
    private List<Employee> listOfEmployees;
    public  static LinkedList<Employee> input(){
    LinkedList res = new LinkedList<Employee>();
        Scanner in = new Scanner(System.in);
        char inputFlag;
        System.out.println("Do you want to enter smth?, [y/n]");
        inputFlag = in.next("\\w{1,1}").charAt(0);
        if(inputFlag != 'y'){
            return res;
        }
    /*
       private String firstName;
private String lastName;
private String position;
private int salary;*/
        Employee emp;
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
        res.add(emp);
        emp = null;
        System.out.println("Do you want to continue input? [y/n]");
        inputFlag = in.next("\\w{1,1}").charAt(0);
        if(inputFlag != 'y'){
            break;
        }
        in.reset();
        }
        return res;

    }
/*


    public static  int checkInt(Scanner in)
    {
        int enteredNum;
        do {
            while(!in.hasNextInt())
            {
                System.out.println("That is not a number!");
                in.next();
            }
            enteredNum = in.nextInt();
        }while (enteredNum <= 0);

        return enteredNum;
    }
*/






    //    ==================


    public static void main(String[] args) {
        LinkedList<Employee> eee = input();
        if(eee.size() > 0){
            System.out.println(eee.getFirst().getFirstName());
        }
    }

}
