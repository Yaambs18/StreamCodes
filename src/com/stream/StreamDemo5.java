package com.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {
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

        // obtaining odd values only usinf filter().
        Stream<Integer> oddVals = myList.stream().filter((n) -> (n%2)==1);
        System.out.println("Odd values: ");
        oddVals.forEach((num) -> System.out.print(num+ " "));
        System.out.println();

        // here two filter operations are pipelined
        oddVals = myList.stream().filter((n) -> (n%2)==1).filter((n) -> n>10);
        System.out.println("Odd values greater than 5: ");
        oddVals.forEach((num) -> System.out.print(num+ " "));
        System.out.println();
    }
}
