//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

package lesson4.homework4;

import java.util.Collections;
import java.util.LinkedList;

public class Hwork4_1 {
    public static void revers() {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("First");
        ll.add("Second");
        ll.add("3");
        ll.add("4");
        System.out.println(ll);

        Collections.reverse(ll);
        System.out.println(ll);
    }
}
