package org.example;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Z1 {

    public void run() throws IOException {
        Path path = Paths.get("book.txt");

        String info = """
                Любимая книга: Гарри Поттер и философский камень
                Автор: Джоан Роулинг
                Жанр: фэнтези
                Год публикации: 1997
                """;

        Files.writeString(path, info);

        System.out.println("\nСвойства файла:");
        System.out.println("Имя: " + path.getFileName());
        System.out.println("Абсолютный путь: " + path.toAbsolutePath());
        System.out.println("Размер: " + Files.size(path) + " байт");
        System.out.println("Существует: " + Files.exists(path));
        System.out.println("Обычный файл: " + Files.isRegularFile(path));
        System.out.println("Доступен для чтения: " + Files.isReadable(path));

        System.out.println("\nСодержимое файла:");
        System.out.println(Files.readString(path));
    }
}