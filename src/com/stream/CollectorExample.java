package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorExample {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Yansh", "7060211033", "yansh.bhardwaj@iedaas.com"));
        myList.add(new NamePhoneEmail("Aditya", "9237423932", "aditya.singh@iedaas.com"));
        myList.add(new NamePhoneEmail("Abhay", "9923384793", "abhay.maheshwari@iedaas.com"));
        myList.add(new NamePhoneEmail("Nikhil", "7062736283", "nikhil.mohan@iedaas.com"));

        // mapping stream to a new stream
        Stream<NamePhone> nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));

        // creating a list of nameAndPhone stream
        List<NamePhone> newList = nameAndPhone.collect(Collectors.toList());

        System.out.println("List of name and phone numbers :");
        for(NamePhone elem: newList){
            System.out.println(elem.name + " " + elem.phonenum);
        }
        System.out.println();

        // again creating stream as collect is terminal operation
        nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));

        // creating a set of nameAndPhone stream
        Set<NamePhone> newSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("Set of name and phone numbers :");
        for(NamePhone elem: newSet){
            System.out.println(elem.name + " " + elem.phonenum);
        }


    }
}
