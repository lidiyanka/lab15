package org.example;


public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, int experience, String programmingLanguage) {
        super(name, salary, experience);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }

}
