package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class BookServiceTest {
    @Test
    void testNull() {
        BookRepository bookRepository = Mockito.mock(BookRepository.class);
        List<Book> bookList = new LinkedList<>();
        BookService bookService = new BookService(bookRepository);
        assertEquals(null, bookService.findBookById("0"));
        assertEquals(null, bookService.findBookById("1"));
        assertEquals(bookList, bookService.findAllBooks());
    }

    @Test
    void testGetAuthor() {
        BookRepository bookRepository = Mockito.mock(BookRepository.class);
        List<Book> bookList = new LinkedList<>();
        BookService bookService = new BookService(bookRepository);
        when(bookRepository.findById("100")).thenReturn(new Book("1", "Book1", "Author1"));
        assertEquals("Author1", bookRepository.findById("100").getAuthor());
    }
}