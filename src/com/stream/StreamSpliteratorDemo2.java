package com.stream;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamSpliteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();

        // spliiterator on stream
        Spliterator<String> spliterator = myStream.spliterator();

        // splitting the first iterator
        Spliterator<String> spliterator2 =spliterator.trySplit();

        if(spliterator2!=null){
            System.out.println("Output from spliterator2: ");
            spliterator2.forEachRemaining(System.out::println);
        }

        System.out.println("\nOutput from spliterator: ");
        spliterator.forEachRemaining(System.out::println);

    }
}
