package com.yma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class EnumarationDemo {

    //Mostly use with vector and obsolete method
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        for (int i = 0; i < 1000; i++) {
            list.add("Element "+i);
        }

        Enumeration enumeration = list.elements();

        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
            //list.add("Something"); occur error
        }
    }

}
