//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.
package lesson2.tasks;

import java.io.FileWriter;
import java.io.IOException;


public class Task4 {
    public static void writeInFile(){
        String str = buildString();
        String str1 = buildString();
        System.out.println("ссылки:" + str1 == str); // сравнение ссылок на строки
        System.out.println("строки:" + str1.equals((str))); // сравнение значения строк
        try (FileWriter in = new FileWriter(("text.txt"))){
            in.append(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String buildString(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++){
            builder.append("TEST");
        }
        return builder.toString();
        //return("TEST".repeat(100)); // короткая запись кода
    }
}
