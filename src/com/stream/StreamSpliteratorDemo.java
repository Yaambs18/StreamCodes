package com.stream;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamSpliteratorDemo {
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
        Spliterator<String> iterator = myStream.spliterator();

        // tryAdvance()
        while(iterator.tryAdvance(System.out::println));

        // forEachRemaining()
        iterator.forEachRemaining((elem) -> System.out.println(elem));
    }
}
