package lesson4;

import lesson4.homework4.Hwork4_2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Task3.run();
//        OurNewStack superstack = new OurNewStack();
//
//        superstack.push(123);
//        superstack.push(156);
//        superstack.push(25);
//        superstack.push(123);
//        superstack.push(1);
//
//        for (int i = 0; i < superstack.getCapacity(); i++) {
//            System.out.println(superstack.pop());

        //---Homework
        //Hwork4_1.revers();
        List<String> ll = new LinkedList<>();

        ll.add("First");
        ll.add("Second");
        ll.add("3");
        ll.add("4");

        Hwork4_2.enqueue((LinkedList<String>) ll);

        System.out.println(Hwork4_2.dequeue((LinkedList<String>) ll));
        System.out.println(Hwork4_2.first((LinkedList<String>) ll));

        }

    }
