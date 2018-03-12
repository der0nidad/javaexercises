package com.der0nidad;


/*реализовать
    1. заполнение контейнера данными с клавиатуры
    2. вывод информации о сотрудниках на экран
    3. поиск сотрудников, состоящих на данной должности
    4. сортировку списка сотрудников по полю фамилия и по полю зарплата
* */
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
