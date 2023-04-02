//Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

package lesson2.homework;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Hwork1 {

    //private static final Logger LOG = Logger.getLogger(Hwork1.class.getName()); // финальная - неизменяемая - константа - возвращает имя класса. private - переменная будет видна только внутри этих скобок
    public static void logwriter(String array) throws IOException {
        Logger logg = Logger.getLogger(Hwork1.class.getName()); // создание логгера с указанием класса, где он расположен
        FileHandler fh = new FileHandler("textH1.txt"); // создание способа записи в файл с именем textH1.txt
        logg.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter(); //задание в каком формате будет выведено сообщение
        fh.setFormatter(sFormat);

        logg.setLevel(Level.INFO);
        logg.info("bubble sorted:" + array);
    }


    public static void bubble_sort (int [] array) throws IOException {
        for (int i =0; i < array.length-1; i++){
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    String to_file = Arrays.toString(array);
                    Hwork1.logwriter(to_file);
                }
            }
        }
    }
}
