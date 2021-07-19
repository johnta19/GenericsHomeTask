package com.Alevel;

public class Goods {
    private String name;

    public Goods(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
