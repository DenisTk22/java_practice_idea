package lesson2.tasks;

public class lecture2 {
    public static void main(String[] args) {
        Object o = 1; GetType(o);
        o = 1.2; GetType(o);
    }

    private static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}
