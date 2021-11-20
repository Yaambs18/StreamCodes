package com.stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
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

        System.out.println("Original list: "+ myList);

        //obtaining stream omn array list.
        Stream<Integer> myStream = myList.stream();

        // obtaining minimum value out of list
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if(minVal.isPresent()){
            System.out.println("Minimum value: "+minVal.get());
        }

        // obtaining maximum value out of list
        // new stream again was obtained because previous min() operation in terminal which consumed the stream
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if(maxVal.isPresent()){
            System.out.println("Maximum value: "+maxVal.get());
        }

    }

}
