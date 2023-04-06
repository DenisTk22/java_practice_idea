//Реализуйте очередь с помощью LinkedList со следующими методами:
//• enqueue() — помещает элемент в конец очереди,
//• dequeue() — возвращает первый элемент из очереди и удаляет его,
//• first() — возвращает первый элемент из очереди, не удаляя.

package lesson4.homework4;

import java.util.LinkedList;
import java.util.Queue;

public class Hwork4_2 {
    public static void queue () {
        //Queue<String> ll = new LinkedList<>();
        Queue<String> q = new LinkedList();

        q.add("First");
        q.add("Second");
        q.add("3");
        q.add("4");
        System.out.println(q);
        q.add("5");
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
    }
}
