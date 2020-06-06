package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product = new Product(1, "test", 100);


    @Test
    void shouldFindByNameIfExists() {
        String textToFind = "test";
        assertTrue(product.matches(textToFind));
    }

    @Test
    void shouldFindByNameIfNotExists() {
        String textToFind = "false";
        assertFalse(product.matches(textToFind));
    }

}