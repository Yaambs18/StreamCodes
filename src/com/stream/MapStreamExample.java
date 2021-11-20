package com.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MapStreamExample {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(3);
        myList.add(18);
        myList.add(71);
        myList.add(10);
        myList.add(27);
        myList.add(34);
        myList.add(2);

        Stream<Double> sqrtStream = myList.stream().map((a) -> Math.sqrt(a));

        double productOfSqrt = sqrtStream.reduce(1.0, (a,b) -> a*b);

        System.out.println("Product of square roots: "+ productOfSqrt);
    }
}
