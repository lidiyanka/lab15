package org.example;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Z2 {

        private final Scanner scanner;

        public Z2(Scanner scanner) {
            this.scanner = scanner;
        }

        public void run() throws IOException {
            Path path = Paths.get("f.txt");
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

            long product = 1;

            System.out.println("Числа из файла:");

            try (BufferedReader reader = Files.newBufferedReader(path)) {
                String line;

                while ((line = reader.readLine()) != null) {
                    int number = Integer.parseInt(line.trim());
                    System.out.print(number + " ");
                    product = Math.multiplyExact(product, number);
                }
            } catch (ArithmeticException e) {
                System.out.println("\nПроизведение выходит за пределы типа long.");
                return;
            }

            System.out.println("\nПроизведение: " + product);
        }
    }
