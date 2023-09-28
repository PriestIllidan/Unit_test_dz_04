package org.example;

import java.util.List;

public class App {
    public static void main(String[] args) {
        BookRepository bookRepository = new InMemoryBookRepository();
        BookService bookService = new BookService(bookRepository);
        System.out.println(bookService.findAllBooks().get(1).getAuthor());
    }
}
