package org.example;
import java.util.*;

public class App {
    public static void main(String[] args) {
                Map<String, Product> products = new HashMap<>();

                products.put("Ноутбук", new Electronics("Ноутбук", 1, 75000, 24));
                products.put("Смартфон", new Electronics("Смартфон", 2, 45000, 12));
                products.put("Телевизор", new Electronics("Телевизор", 3, 60000, 36));
                products.put("Молоко", new Food("Молоко", 4, 100, "2026-11-01"));
                products.put("Хлеб", new Food("Хлеб", 5, 50, "2026-10-27"));
                products.put("Сыр", new Food("Сыр", 6, 650, "2026-11-15"));
                products.put("Футболка", new Clothing("Футболка", 7, 1200, "M"));
                products.put("Джинсы", new Clothing("Джинсы", 8, 3500, "L"));
                System.out.println("Список товаров");

        List<String> names = new ArrayList<>(products.keySet());
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println("Ключ: " + name);
            System.out.println("Значение: " + products.get(name));
            System.out.println();
        }
                System.out.println("Всего товаров: " + products.size());



            List<Book> books = new ArrayList<>();
            books.add(new Book(1, "Война и мир", "Толстой", 5, Arrays.asList(5, 5, 4)));
            books.add(new Book(2, "Преступление и наказание", "Достоевский", 3, Arrays.asList(2, 3, 2)));
            books.add(new Book(3, "Мастер и Маргарита", "Булгаков", 4, Arrays.asList(5, 4, 5)));
            books.add(new Book(4, "Анна Каренина", "Толстой", 2, Arrays.asList(4, 4, 4)));
            books.add(new Book(5, "Отцы и дети", "Тургенев", 3, Arrays.asList(3, 3, 3)));

        // 1. Удалить книги со средним рейтингом меньше 3
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAverageRating() < 3) {
                books.remove(i);
                i--;
            }
        }

// 2. Повысить популярность книг со средним рейтингом >= 4
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAverageRating() >= 4) {
                books.get(i).setPopularity(
                        books.get(i).getPopularity() + 1
                );
            }
        }

        // 3. Вывести книги с популярностью 5
        System.out.println("Книги с популярностью 5:");
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPopularity() == 5) {
                System.out.println(books.get(i).getTitle());
            }
        }

            // 4. Сортировка по убыванию рейтинга,
            // при равенстве рейтинга — по названию

        books.sort(Comparator.comparingDouble(Book:: getAverageRating).reversed().thenComparing(Book::getTitle));
        for (int i = 0; i < books.size() - 1; i++) {
            for (int j = 0; j < books.size() - 1 - i; j++) {
                Book b1 = books.get(j);
                Book b2 = books.get(j + 1);
                if (b1.getAverageRating() < b2.getAverageRating() ||
                        (b1.getAverageRating() == b2.getAverageRating() &&
                                b1.getTitle().compareTo(b2.getTitle()) > 0)) {
                    books.set(j, b2);
                    books.set(j + 1, b1);
                }
            }
        }
            System.out.println("Книги после сортировки:");
            for (Book book : books) {
                System.out.println(
                        "ID: " + book.getId() +
                                ", Название: " + book.getTitle() +
                                ", Средний рейтинг: " +
                                book.getAverageRating()
                );
            }
        }
    }

