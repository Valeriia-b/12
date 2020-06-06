package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Smartphone smartphone = new Smartphone(1, "iPhone7", 1000, "Apple");


    @Test
    void shouldFindByNameIfExists() {
        String textToFind = "iPhone7";
        assertTrue(smartphone.matches(textToFind));
    }

    @Test
    void shouldFindByNameIfNotExists() {
        String textToFind = "false";
        assertFalse(smartphone.matches(textToFind));
    }

    @Test
    void shouldFindByMakerIfExists() {
        String textToFind = "Apple";
        assertTrue(smartphone.matches(textToFind));
    }

    @Test
    void shouldFindByMakerIfNotExists() {
        String textToFind = "false";
        assertFalse(smartphone.matches(textToFind));
    }


}