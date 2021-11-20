package com.stream;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(1.1);
        myList.add(12.7);
        myList.add(7.3);
        myList.add(9.2);
        myList.add(5.0);
        myList.add(4.3);

        System.out.println("Original values in myList: ");
        myList.stream().forEach((a) -> System.out.print(a+ " "));
        System.out.println();

        // mapping the ceiling of elements in myList to IntStream.
        IntStream cStrm = myList.stream().mapToInt((a) -> (int)Math.ceil(a));

        System.out.println("The ceilings of the values in mylist: ");
        cStrm.forEach((a) -> System.out.print(a+" "));
    }
}
