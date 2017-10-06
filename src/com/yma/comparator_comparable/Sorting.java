package com.yma.comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Saman","SriLanka"));
        studentList.add(new Student(11,"Smith","London"));
        studentList.add(new Student(8,"Khan","India"));
        studentList.add(new Student(6,"Trishet","Pakistan"));

        System.out.println("Before Sorting");
        System.out.println(studentList);

        Collections.sort(studentList);

        System.out.println("After Sorting");
        System.out.println(studentList);


        //Sorting by comparator
        Collections.sort(studentList, Student.NameComparator);
        System.out.println("Sorting by Name");
        System.out.println(studentList);
    }
}
