package com.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail{
    String name;
    String phonenum;
    String email;

    NamePhoneEmail(String name, String phonenum, String email){
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }
}

class NamePhone{
    String name;
    String phonenum;

    NamePhone(String name, String phonenum){
        this.name = name;
        this.phonenum = phonenum;
    }
}

public class StreamMapExample2 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Yansh", "7060211033", "yansh.bhardwaj@iedaas.com"));
        myList.add(new NamePhoneEmail("Aditya", "9237423932", "aditya.singh@iedaas.com"));
        myList.add(new NamePhoneEmail("Abhay", "9923384793", "abhay.maheshwari@iedaas.com"));
        myList.add(new NamePhoneEmail("Nikhil", "7062736283", "nikhil.mohan@iedaas.com"));

        System.out.println("Oroginal list: ");
        myList.stream().forEach((a) -> System.out.println(a.name + " " + a.phonenum + " " + a.email));
        System.out.println("\n");

        // mapping stream to a new stream
        Stream<NamePhone> nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));

        System.out.println("List of name and phone numbers :");
        nameAndPhone.forEach((a) -> System.out.println(a.name + " " + a.phonenum));

        // mapping with filter
        Stream<NamePhone> namePhoneStream = myList.stream().
                filter((a) -> a.name.equals("Yansh")).
                map((a) -> new NamePhone(a.name, a.phonenum));

        namePhoneStream.forEach((a) -> System.out.println("\n"+ a.name + " " + a.phonenum));

    }
}
