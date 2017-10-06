package com.yma;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("Name " + i);
        }


        Iterator <String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }

        System.out.println(list.size());
    }
}
