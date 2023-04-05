package lesson4;

import lesson4.tasks.OurNewStack;

public class Main {
    public static void main(String[] args) {
        // Task3.run();
        OurNewStack superstack = new OurNewStack();

        superstack.push(123);
        superstack.push(156);
        superstack.push(25);
        superstack.push(123);
        superstack.push(1);

        for (int i = 0; i < superstack.getCapacity(); i++) {
            System.out.println(superstack.pop());
        }

    }

}
