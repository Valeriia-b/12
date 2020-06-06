package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    private String maker;

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public Smartphone(int id, String name, int price, String maker) {
        super(id, name, price);
        this.maker = maker;
    }
}
