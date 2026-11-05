package org.example;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

    public class Z3 {
        private final Scanner scanner;

        public Z3(Scanner scanner) {
            this.scanner = scanner;
        }

        public void run() throws IOException {
            Path path = Paths.get("f_numbers.txt");
            int[] numbers = new int[10];

            System.out.println("Введите 10 целых чисел:");

            for (int i = 0; i < numbers.length; i++) {
                System.out.print((i + 1) + ": ");
                numbers[i] = Integer.parseInt(scanner.nextLine().trim());
            }

            try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                for (int number : numbers) {
                    writer.write(Integer.toString(number));
                    writer.newLine();
                }
            }

            int count = 0;

            System.out.println("Числа из файла:");

            try (BufferedReader reader = Files.newBufferedReader(path)) {
                String line;

                while ((line = reader.readLine()) != null) {
                    int number = Integer.parseInt(line.trim());
                    System.out.print(number + " ");

                    if (number % 5 == 0) {
                        count++;
                    }
                }
            }

            System.out.println("\nКоличество чисел, кратных 5: " + count);
        }
    }
