// Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.

package lesson4.tasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task2 {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        Deque<String> texts = new ArrayDeque();

        while (true) {
            System.out.println(
                    "\nInput please, \n[text] for add text to list," +
                            "\nprint for reverce print texts" +
                            "\nrevert for remove last inputed string\n or exit for end\n\t ->"
            );
            String stg = scanner.nextLine();

            if (stg.equalsIgnoreCase("print")) {
                System.out.println(texts); // выведет задом наперед
            }else if (stg.equalsIgnoreCase("revert")){
                System.out.println("Удаляем -> " + texts.pop()); // выбирает и удаляет
            } else {
                texts.push(stg);
            }

            if (stg.equals("exit")) {
                System.out.println("EXIT");
                break;
            }
        }
    }
}
