package com.stream;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo2 {
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

        Optional<Integer> productObj = myList.stream().reduce((a,b) -> a*b);
        if(productObj.isPresent())
            System.out.println("Product as Optional: "+ productObj.get());

        int product = myList.stream().reduce(1, (a,b) -> a*b);
        System.out.println("Product as int: "+ product);

    }
}
