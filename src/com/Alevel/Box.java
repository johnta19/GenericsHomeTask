package com.Alevel;

public class Box<T extends Goods> {

    private T item;


    public void put(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }


    @Override
    public String toString() {
        return item.toString();
    }

}
