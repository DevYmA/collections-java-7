package com.yma.set.treeset;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(9);
        treeSet.iterator();
        System.out.println(treeSet);//sorting elements


        TreeSet mensList = new TreeSet();
        mensList.add(new Man(7));
        mensList.add(new Man(5));
        mensList.add(new Man(8));
        mensList.add(new Man(6));
        mensList.add(new Man(4));

        System.out.println(mensList);//If we add some custom object we have to using compare - > like look Man class


    }
}
