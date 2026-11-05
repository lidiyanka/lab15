package org.example;
public class Developer extends Employee {
    private String language;

    public Developer(String name, double salary, int experience,
                     String language) {
        super(name, salary, experience);
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println("Пишет код");
    }
    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Язык программирования: " + language);
        System.out.println("Бонус: " + calculateBonus() + " руб.");
    }
}
