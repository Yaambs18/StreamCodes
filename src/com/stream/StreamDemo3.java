package com.stream;

import java.util.ArrayList;

public class StreamDemo3 {
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

        int evenProduct = myList.stream().reduce(1, (a,b) -> {if(b%2==0) return a*b; else return a;});
        System.out.println("Product as int: "+ evenProduct);

    }
}
