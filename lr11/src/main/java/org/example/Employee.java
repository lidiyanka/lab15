package org.example;


public class Employee {
    protected String name;
    protected double salary;
    protected int experience;

    public Employee(String name, double salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public String work() {
        return "Работает";
    }

    public String work(int hours) {
        return "Работает " + hours + " часов";
    }

    public String work(String project) {
        return "Работает над проектом " + project;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }
}
