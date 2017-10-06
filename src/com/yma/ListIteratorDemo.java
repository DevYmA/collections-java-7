package com.yma;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Mohidin");
        list.add("Carl");
        list.add("Sarah");
        list.add("Kasun");
        list.add("Vimal");

        LinkedList lsit = new LinkedList();
        ListIterator li = list.listIterator();
        System.out.println("Traversing Forward >>");
        while (li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("Traversing Backward <<");
        while (li.hasPrevious()){
            System.out.println(li.previous());
            li.add("New");
        }
     }
}
