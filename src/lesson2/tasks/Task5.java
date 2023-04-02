//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-

//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

package lesson2.tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Task5 {
    private static final Logger LOG = Log.log(Task5.class.getName()); // финальная - неизменяемая - константа - возвращает имя класса. private - переменная будет видна только внутри этих скобок
    public static void write(String path) {
        try (FileWriter in = new FileWriter(("text5.txt"))){
            String[] data = getFilesInFolder(path);
            for (String datum : data){
                in.append(datum);
            }
            LOG.log(Level.INFO, "Записано");
            //throw new IOException("ошибка");
        } catch (IOException e) { // обработка исключения
            LOG.log(Level.INFO, e.getMessage()); //уровень INFO, будет получено сообщение об ошибке
            throw new RuntimeException(e);
        }
    }


    public static String[] getFilesInFolder(String path) {
        File dir = new File(path); // создание файла
        String[] result = null; // или = new String[0];
        File[] files; // массив файлов
        if (dir.isDirectory()) { // проверка это папка или нет
            files = dir.listFiles();
            if (files != null) { // если массив файлов не пустой...
                result = new String[files.length]; //... то определяем длину строки result как длину массива файлов
                for (int i = 0; i < files.length; i++) {
                    String name = files[i].getName(); //получаем файл и через точку получаем имя
                    if (files[i].isFile()) { // если элемент это файл, то ...
                        System.out.println("\tFile - " + name); // ... печатем "File - имя файла", если ...
                    } else {
                        System.out.println("Directory - " + name); // ... если это не файл, то тогда это директория и печатаем "Directory - имя директории"
                    }
                    result[i] = name; // возвращаем имя i-го элемента

                }
            }
        } else {
            System.out.println(dir.getName() + " не является папкой"); // если это не папка, то печатаем "Имя директории - не является папкой"
        }

        return result; // возвращаем result
    }
}
