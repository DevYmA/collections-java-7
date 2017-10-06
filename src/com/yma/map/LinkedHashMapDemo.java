package com.yma.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        //Following insertion order
        LinkedHashMap<Integer, String> personMap = new LinkedHashMap<>();
        personMap.put(8,"Jane");
        personMap.put(5,"Will");
        personMap.put(6,"Smith");
        personMap.put(9,"Kamal");
        personMap.put(07,"Sunil");
        personMap.put(11,"Nadana");
        personMap.put(null,null);//Only one null key

        System.out.println(personMap);
    }
}
