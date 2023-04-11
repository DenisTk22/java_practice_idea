package lesson6;

import lesson6.tasks.Cat;
import lesson6.tasks.Owner;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Denis", "+789651423");
        Cat cat = new Cat("Masya", 10, true, "linka",owner);
        Cat cat2 = new Cat("Masya", 10, true, "linka",owner);
        Cat cat3 = new Cat("Masya", 10, true, "linka",owner);
        Cat cat4 = new Cat("Barsik", 7, false, null,owner);
        System.out.println(cat);
        Set<Cat> cats = new HashSet<>();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        System.out.println(cats);
    }
}