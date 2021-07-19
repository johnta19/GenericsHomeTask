package com.Alevel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Box<T extends Goods> {

    private T item;


    public void put(T item) {
        this.item = item;
    }

//    public void add(T items) {
//        item.add(items);
//    }

//    public <S extends T> void addAll(S item) {
//        this.item.add(item);
//    }

//    public List<T> getList() {
//        return item;
//    }

    @Override
    public String toString() {
        return item.toString();
    }

}
