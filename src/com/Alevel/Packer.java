package com.Alevel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Packer {
    public static void main(String[] args) {
//        Box<Food> foodBox = new Box<>();
//        foodBox.put(new Food("potato"));
//        Box<Cake> cakeBox = new Box<>();
//        cakeBox.put(new Cake("tort"));
//        Box<Pie> pieBox = new Box<>();
//        pieBox.put(new Pie("pie"));
//
//        repackage(cakeBox, foodBox);
//        repackage(pieBox, foodBox);
//        repackage(foodBox, foodBox);
//       System.out.println(foodBox);

        List<Food> foodList = new ArrayList<>();
        //foodList.add(new Food("food"));
        List<Cake> cakeList = new ArrayList<>();
        cakeList.add(new Cake("cake"));
        List<Pie> pieList = new ArrayList<>();
        pieList.add(new Pie("pie"));
        List<Tart> tartList = new ArrayList<>();
        tartList.add(new Tart("tart"));

        repackage(foodList, foodList);
        repackage(cakeList, foodList);
        repackage(pieList, foodList);
        repackage(tartList, foodList);

        System.out.println(foodList);

    }

//    public static void repackage(Box<? extends Food> src, Box<Food> dest) {
//        for (Food food : src) {
//            dest.put(food);
//        }
//
//    }

    public static void repackage(List<? extends Food> src, List<Food> dest) {
//        dest.addAll(src);
        for(Food food : src) {
            dest.add(food);
        }
    }

}

