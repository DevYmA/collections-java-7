package com.yma.list.vectors;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> nameVec = new Vector<>(2);
        nameVec.add("Perera");
        nameVec.add("Vijay");
        nameVec.add("Silva");
        nameVec.add("Padmakanth");

        System.out.println("Size :"+nameVec.size());
        System.out.println("Default capacity increment :"+nameVec.capacity());

        nameVec.add("Siera");
        nameVec.add("Nick");
        nameVec.add("Frank");

        System.out.println("Size + 3 :"+nameVec.size());
        System.out.println("Default capacity increment + 3 :"+nameVec.capacity());



        Enumeration en =  nameVec.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
