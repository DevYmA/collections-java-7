package com.yma.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        //not allow insertion order
        PriorityQueue <String> queue = new PriorityQueue<>();
        queue.add("Kathey");
        queue.add("Sally");
        queue.add("Jane");
        queue.add("Vikram");
        queue.add("Krishan");
        queue.add("Viraj");
        queue.add("Saman");
        queue.add("Vimal");
        queue.add("Janey");//duplication allow
        //queue.add(null);if we aded null throw exception

        System.out.println("Head : "+queue.element());//if dosen't exist throw exception
        System.out.println("Head : "+queue.peek());//if dosen't exist return null

        System.out.println("-----------------");
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Remove Head: "+queue.remove());
        System.out.println("Remove Head : "+queue.poll());

        System.out.println("-----------------");
        Iterator iterator2 = queue.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }


    }
}
