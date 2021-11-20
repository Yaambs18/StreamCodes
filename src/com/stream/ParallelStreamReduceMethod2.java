package com.stream;

// in pervious example accumulator and combiner perform same function but here differ------

import java.util.ArrayList;

public class ParallelStreamReduceMethod2 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(3.0);
        myList.add(18.0);
        myList.add(71.0);
        myList.add(10.0);
        myList.add(27.0);
        myList.add(34.0);
        myList.add(2.0);

        double productOfSqrts = myList.parallelStream().reduce(1.0, (a,b) -> a * Math.sqrt(b), (a,b) -> a*b);

        System.out.println("Product of squareroots: "+ productOfSqrts);
    }
}
