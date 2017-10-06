package com.yma.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("John");
        nameList.add("Charles");
        nameList.add("Kathy");
        nameList.add("Will");
        nameList.add("Will");//allow Duplication

        System.out.println("Elements of name list :"+ nameList);//Insertion Ordered

        List<Integer> numberList = new ArrayList<>();
        numberList.add(new Integer(0));
        numberList.add(new Integer(2));
        numberList.add(new Integer(5));
        numberList.add(null);//allow null values

        System.out.println("Elements of number list :"+ numberList);

        System.out.println(numberList.get(1));//we can access element using index number
    }

}
