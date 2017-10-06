package com.yma.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet lnkHasSet = new LinkedHashSet();
        lnkHasSet.add("Jony");
        lnkHasSet.add("Willium");
        lnkHasSet.add(null);
        lnkHasSet.add(null);//one null val
        lnkHasSet.add("Khan");
        lnkHasSet.add("Andrew");
        lnkHasSet.add("Jony");//dosen't allow duplication

        //allow insertion order
        System.out.println(lnkHasSet);


    }
}
