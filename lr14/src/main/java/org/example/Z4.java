package org.example;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Z4 {
        public void run() throws IOException {
            Path f = Paths.get("f.txt");
            Path g = Paths.get("g.txt");
            Path h = Paths.get("h.txt");

            Random random = new Random();
            int count = 20;

            try (BufferedWriter writer = Files.newBufferedWriter(f)) {
                for (int i = 0; i < count; i++) {
                    int number = random.nextInt(201) - 100;

                    writer.write(Integer.toString(number));
                    writer.newLine();
                }
            }

            try (
                    BufferedReader reader = Files.newBufferedReader(f);
                    BufferedWriter writerG = Files.newBufferedWriter(g);
                    BufferedWriter writerH = Files.newBufferedWriter(h)
            ) {
                String line;

                while ((line = reader.readLine()) != null) {
                    int number = Integer.parseInt(line.trim());
                    int abs = Math.abs(number);

                    if (abs >= 10 && abs <= 99) {
                        writerG.write(Integer.toString(number));
                        writerG.newLine();
                    } else {
                        writerH.write(Integer.toString(number));
                        writerH.newLine();
                    }
                }
            }

            System.out.println("Случайные числа записаны в f.txt.");

            System.out.println("Двузначные числа из g.txt:");
            System.out.println(Files.readString(g));

            System.out.println("Остальные числа из h.txt:");
            System.out.println(Files.readString(h));
        }
    }