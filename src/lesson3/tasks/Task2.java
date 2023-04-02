//Каталог товаров книжного магазина сохранен в виде двумерного списка
// List<ArrayList<String>> так, что на 0-й позиции каждого внутреннего списка содержится название жанра,
// а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.

package lesson3.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static List<ArrayList<String>> library = new ArrayList<>();
    public static void filllibrary (ArrayList<String> books) {
        library.add(books);
        System.out.println(library);
    }
}
