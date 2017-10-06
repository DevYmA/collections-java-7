package com.yma.list.linkedllist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Jane");
        linkedList.add("Magie");
        linkedList.add("Darl");
        linkedList.add("Rick");


        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
