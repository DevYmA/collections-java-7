package com.yma.set;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add("Jane");
        hashSet.add("Donald");
        hashSet.add("Mary");

        hashSet.add("Jerry");
        hashSet.add("Sailaja");
        hashSet.add("Jane");//dosent' allow duplication

        hashSet.add(null);
        hashSet.add(null);//Only once null

        System.out.println(hashSet);


    }
}
