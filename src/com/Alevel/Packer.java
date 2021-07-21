package com.Alevel;

public class Packer {
    public static void main(String[] args) {
        Box<Food> foodBox = new Box<>();
        foodBox.put(new Food("food"));
        Box<Cake> cakeBox = new Box<>();
        cakeBox.put(new Cake("cake"));
        Box<Pie> pieBox = new Box<>();
        pieBox.put(new Pie("pie"));

        System.out.println(foodBox);
        repackage(cakeBox, foodBox);
        System.out.println(foodBox);
        repackage(pieBox, foodBox);
        System.out.println(foodBox);
        repackage(foodBox, foodBox);
       System.out.println(foodBox);

    }

    public static void repackage(Box<? extends Food> src, Box<Food> dest) {
        dest.put(src.getItem());

    }

}

