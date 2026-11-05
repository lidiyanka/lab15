
package org.example;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int pages;
    private boolean available;

    public Book(String title, String author, String isbn, int pages)
            throws InvalidISBNException {
        this.title = title;
        this.author = author;
        setIsbn(isbn);
        setPages(pages);
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Проверка ISBN в сеттере
    public void setIsbn(String isbn) throws InvalidISBNException {
        if (isbn == null || !isbn.matches("\\d{3}-\\d-\\d{4}-\\d{4}-\\d")) {
            throw new InvalidISBNException("Неверный формат ISBN!");
        }

        this.isbn = isbn;
    }

    public void setPages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException(
                    "Количество страниц должно быть больше 0!"
            );
        }

        this.pages = pages;
    }

    // Выдача книги
    public void borrow() throws BookNotAvailableException {
        if (!available) {
            throw new BookNotAvailableException(
                    "Книга уже выдана: " + title
            );
        }

        available = false;
        System.out.println("Книга выдана: " + title);
    }

    // Возврат книги
    public void returnBook() {
        available = true;
        System.out.println("Книга возвращена: " + title);
    }

    @Override
    public String toString() {
        return "Название: " + title +
                ", автор: " + author +
                ", ISBN: " + isbn +
                ", страниц: " + pages +
                ", доступна: " + available;
    }
}
