package com.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();

        // iterator on stream
        Iterator<String> iterator = myStream.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
