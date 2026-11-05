package org.example;


public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int experience, int teamSize) {
        super(name, salary, experience);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }
}
