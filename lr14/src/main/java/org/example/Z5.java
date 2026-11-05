package org.example;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;
public class Z5 {

    private final Scanner scanner;

    public Z5(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() throws IOException {
        Path path = Paths.get("temperature.txt");
        double[] temperatures = new double[5];

        System.out.println("Введите 14 значений температуры тела:");

        for (int i = 0; i < temperatures.length; i++) {
            while (true) {
                System.out.print((i + 1) + ": ");
                try {
                    double value = Double.parseDouble(
                            scanner.nextLine().trim().replace(',', '.')
                    );

                    if (value < 0) {
                        System.out.println("Ошибка: температура не может быть отрицательной. Повторите ввод.");
                        continue;
                    }

                    temperatures[i] = value;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введите корректное числовое значение. Повторите ввод.");
                }
            }
        }

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (double temperature : temperatures) {
                writer.write(Double.toString(temperature));
                writer.newLine();
            }
        }

        double sum = 0;
        int count = 0;

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;

            while ((line = reader.readLine()) != null) {
                double value = Double.parseDouble(line.trim());

                if (value < 0) {
                    System.out.printf("Предупреждение: пропущено отрицательное значение в файле: %.2f%n", value);
                    continue;
                }

                sum += value;
                count++;
            }
        }

        if (count > 0) {
            System.out.printf(
                    Locale.US,
                    "Средняя температура: %.2f °C%n",
                    sum / count
            );
        } else {
            System.out.println("Файл не содержит корректных значений.");
        }
    }}