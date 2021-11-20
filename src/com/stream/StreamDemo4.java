package com.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
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

        System.out.println("Original list: " + myList);

        //obtaining stream omn array list.
        Stream<Integer> myStream = myList.stream();

        // sorting the stream
        Stream<Integer> sortedStream = myList.stream().sorted();

        System.out.println("Sorted stream: ");
        sortedStream.forEach((num) -> System.out.print(num+" "));
        System.out.println();
    }
}
