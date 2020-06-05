package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(repository);
    private Product book1 = new Book(1, "Гарри Поттер и филосовский камень", 101, "Джоан Роулинг");
    private Product book2 = new Book(2, "Гарри Поттер и тайная комната", 102, "Джоан Роулинг");
    private Product book3 = new Book(3, "test book", 103, "test");
    private Product phone1 = new Smartphone(1, "iPhone7", 1000, "Apple");
    private Product phone2 = new Smartphone(2, "test phone", 900, "test");

    @BeforeEach
    public void save(){
        manager.save(book1);
        manager.save(book2);
        manager.save(book3);
        manager.save(phone1);
        manager.save(phone2);
    }

    @Test
    void shouldSearchByAuthor() {
    Product[] actual = manager.searchBy("Джоан Роулинг");
    Product[] expected = new Product[] {book1, book2};
    assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByBookName() {
        Product[] actual = manager.searchBy("Гарри Поттер и филосовский камень");
        Product[] expected = new Product[] {book1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByMakerSmartphone() {
        Product[] actual = manager.searchBy("Apple");
        Product[] expected = new Product[] {phone1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByNameSmartphone() {
        Product[] actual = manager.searchBy("test phone");
        Product[] expected = new Product[] {phone2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBySmartphoneAndBook() {
        Product[] actual = manager.searchBy("test");
        Product[] expected = new Product[] {book3, phone2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchIfNotExist() {
        Product[] actual = manager.searchBy("Гарри Поттер и узник Азкабана");
        Product[] expected = new Product[] {};
        assertArrayEquals(expected, actual);
    }

}