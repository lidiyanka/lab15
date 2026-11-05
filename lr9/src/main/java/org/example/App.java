package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
                Employee[] employees = {
                        new Manager("Иван", 100000, 10, 8),
                        new Manager("Анна", 120000, 12, 12),
                        new Developer("Пётр", 80000, 3, "Java"),
                        new Developer("Мария", 90000, 5, "JS"),
                        new Developer("Алексей", 85000, 4, "C#")
                };

                for (Employee employee : employees) {
                    System.out.println();
                    employee.displayInfo();
                    employee.work();
                }
            }
        }
