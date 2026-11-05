package org.example;
import java.util.Scanner;
/**
 * Hello world!
 */
public class App {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("1 — Информация о любимой книге");
            System.out.println("2 — Произведение 10 целых чисел");
            System.out.println("3 — Разделение чисел на двузначные и остальные");
            System.out.println("4 — Средняя температура по 14 значениям");
            System.out.println("5 — Количество чисел, кратных 5");
            System.out.println("0 — Выход");
            System.out.print("Выберите задание: ");

            String choice = scanner.nextLine().trim();

            try {
                switch (choice) {
                    case "1":
                        new Z1().run();
                        break;
                    case "2":
                        new Z2(scanner).run();
                        break;
                    case "3":
                        new Z4().run();
                        break;
                    case "4":
                        new Z3(scanner).run();
                        break;
                    case "5":
                        new Z5(scanner).run();
                        break;
                    case "0":
                        System.out.println("Завершение программы.");
                        return;
                    default:
                        System.out.println("Нет такого пункта меню.");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}