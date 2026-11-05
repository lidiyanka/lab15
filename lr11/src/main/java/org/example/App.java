package org.example;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Иван", 50000, 3);
        Manager manager = new Manager("Анна", 80000, 5, 10);
        Developer developer = new Developer("Петр", 70000, 4, "Java");

        System.out.println("Перегрузка методов:");
        System.out.println(employee.work());
        System.out.println(employee.work(8));
        System.out.println(employee.work("CRM"));


        System.out.println();
        System.out.println("Переопределение методов:");
        Employee[] employees = {employee, manager, developer};

        for (Employee e : employees) {
            System.out.println(e.name + ": премия = " + e.calculateBonus());
        }
        System.out.println();
        System.out.println("Сравнение полиморфизма:");
        System.out.println("Статический полиморфизм: перегрузка методов work()");
        System.out.println("Динамический полиморфизм: переопределение calculateBonus()");
    }
}