package com.stream;

import java.util.ArrayList;

public class ParallelStreamReduceMethod {
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

        // using simple reduce method
        int parrallelProduct = myList.parallelStream().reduce(1, (a, b) -> a * b);
        System.out.println("Product as int: " + parrallelProduct);

        // using third version of reduce works especially with parallel st5ream
        int parrallelProduct2 = myList.parallelStream().reduce(1, (a, b) -> a * b, (a,b) -> a * b);
        System.out.println("Product as int: " + parrallelProduct2);
    }
}
