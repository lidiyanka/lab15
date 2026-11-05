package org.example;
public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int experience,
                   int teamSize) {
        super(name, salary, experience);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println("Управляет командой");
    }
    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Размер команды: " + teamSize);
        System.out.println("Бонус: " + calculateBonus() + " руб.");
    }
}
