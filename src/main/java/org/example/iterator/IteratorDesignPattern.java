package org.example.iterator;

import java.util.*;

public class IteratorDesignPattern {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        Iterator<String> itr = list.iterator();
        System.out.println("Concrete iterator implementation is : "+itr.toString());

        while(itr.hasNext()){
            System.out.println("letter : "+itr.next());
        }

        Set<String> set = new HashSet<>();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        Iterator<String> setItr = set.iterator();
        System.out.println("Concrete iterator implementation is : "+setItr.toString());

        while(setItr.hasNext()){
            System.out.println("Letter set : "+setItr.next());
        }

    }
}
