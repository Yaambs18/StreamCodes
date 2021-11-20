package com.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorExample2 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Yansh", "7060211033", "yansh.bhardwaj@iedaas.com"));
        myList.add(new NamePhoneEmail("Aditya", "9237423932", "aditya.singh@iedaas.com"));
        myList.add(new NamePhoneEmail("Abhay", "9923384793", "abhay.maheshwari@iedaas.com"));
        myList.add(new NamePhoneEmail("Nikhil", "7062736283", "nikhil.mohan@iedaas.com"));

        // mapping stream to a new stream
        Stream<NamePhone> nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));

        // creating a LinkedList of nameAndPhone stream with second version of #collect()
        LinkedList<NamePhone> newList = nameAndPhone.collect(() -> new LinkedList<>(),
                (list, element) -> list.add(element),
                (listA, listB) -> listA.addAll(listB));

        System.out.println("List of name and phone numbers :");
        for(NamePhone elem: newList){
            System.out.println(elem.name + " " + elem.phonenum);
        }
        System.out.println();

        nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));

        // without declaring lambda expression as an argument in collect()
        HashSet<NamePhone> newSet = nameAndPhone.collect(HashSet::new, HashSet::add, HashSet::addAll);

        System.out.println("Set of name and phone numbers :");
        for(NamePhone elem: newSet){
            System.out.println(elem.name + " " + elem.phonenum);
        }
    }
}
