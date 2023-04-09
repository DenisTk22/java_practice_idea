//Реализуйте очередь с помощью LinkedList со следующими методами:
//• enqueue() — помещает элемент в конец очереди,
//• dequeue() — возвращает первый элемент из очереди и удаляет его,
//• first() — возвращает первый элемент из очереди, не удаляя.

package lesson4.homework4;

import java.util.LinkedList;

public class Hwork4_2 {

    //private LinkedList<String> ll = new LinkedList<>();

//    ll.add("First");
//        ll.add("Second");
//        ll.add("3");
//        ll.add("4");
//        System.out.println(ll);

    public static void enqueue(LinkedList<String> list){
        list.addLast(list.element());
        System.out.println(list);
    }

    public static String dequeue(LinkedList<String> list){
        return list.pollFirst();

    }

    public static String first(LinkedList<String> list){
        return list.getFirst();
    }
}
