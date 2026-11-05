
package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {



    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        try {
            books.add(new Book("Война и мир", "Толстой",
                    "123-4-5678-9012-3", 1200));

            books.add(new Book("Преступление и наказание", "Достоевский",
                    "234-5-6789-0123-4", 600));

            books.add(new Book("Мастер и Маргарита", "Булгаков",
                    "345-6-7890-1234-5", 400));

            System.out.println("Список книг:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i));
            }

            // Ищем книгу по названию
            Book book = null;
            String title = "Война и мир";

            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getTitle().equals(title)) {
                    book = books.get(i);
                    break;
                }
            }

            if (book == null) {
                System.out.println("Книга не найдена: " + title);
            } else {
                try {
                    book.borrow();
                    System.out.println("Книга выдана.");
                } catch (BookNotAvailableException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

            try {
                    book.borrow();
                } catch (BookNotAvailableException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                book.returnBook();

                try {
                    book.setIsbn("12345");
                } catch (InvalidISBNException e) {
                    System.out.println("Ошибка ISBN: " + e.getMessage());
                }
            }

            // Ищем несуществующую книгу
            String missingTitle = "Несуществующая книга";
            boolean found = false;

            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getTitle().equals(missingTitle)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
               throw new pdomn("oidf");
            }

        } catch (InvalidISBNException e) {
            System.out.println("Ошибка создания книги: " + e.getMessage());
        }
    }
}