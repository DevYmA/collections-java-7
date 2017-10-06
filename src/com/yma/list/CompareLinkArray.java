package com.yma.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareLinkArray {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        //add - ArrayList
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        long endTime = System.nanoTime();
        long timeDuration = endTime - startTime;

        System.out.println("ArrayList add(i) : "+ timeDuration);

        //add - LinkedList
        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        endTime = System.nanoTime();
        timeDuration = endTime - startTime;
        System.out.println("Linked list add(i) : "+ timeDuration);


        // get - ArrayList

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();

        timeDuration = endTime - startTime;

        System.out.println("Array List get : "+timeDuration);


        //get - LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        timeDuration = endTime - startTime;

        System.out.println("Linked List get : "+endTime);

    }
}
