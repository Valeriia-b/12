package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book = new Book(1, "Гарри Поттер и филосовский камень", 101, "Джоан Роулинг");


    @Test
    void shouldFindByNameIfExists() {
        String textToFind = "Гарри Поттер и филосовский камень";
        assertTrue(book.matches(textToFind));
    }

    @Test
    void shouldFindByNameIfNotExists() {
        String textToFind = "false";
        assertFalse(book.matches(textToFind));
    }

    @Test
    void shouldFindByAuthorIfExists() {
        String textToFind = "Джоан Роулинг";
        assertTrue(book.matches(textToFind));
    }

    @Test
    void shouldFindByAuthorIfNotExists() {
        String textToFind = "false";
        assertFalse(book.matches(textToFind));
    }

}