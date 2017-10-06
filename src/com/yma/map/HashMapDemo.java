package com.yma.map;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(null,null);//Only one null key
        map.put(404,"Not Found");
        map.put(500,"Internal Server Error");
        map.put(200,"OK");
        map.put(303,"See other");
        map.put(450,"See other");
        map.put(789,"See other");
        map.put(587,"See other");
        map.put(293,"See other");
        map.put(583,"See other");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()){

            Map.Entry<Integer, String> next = iterator.next();

            System.out.println(next.getKey() +" : "+next.getValue());
        }
    }
}
