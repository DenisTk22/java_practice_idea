//Пусть дан список сотрудников:.....
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности.

package lesson5.homework5;

import java.util.*;

public class Hwork5_2 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        Map<String, Integer> nameToCount = new HashMap<>();

        employees.add("Иван Иванов");
        employees.add("Светлана Петрова");
        employees.add("Кристина Белова");
        employees.add("Анна Мусина");
        employees.add("Анна Крутова");
        employees.add("Иван Юрин");
        employees.add("Петр Лыков");
        employees.add("Павел Чернов");
        employees.add("Иван Иванов");
        employees.add("Петр Чернышов");
        employees.add("Мария Федорова");
        employees.add("Марина Светлова");
        employees.add("Мария Савина");
        employees.add("Иван Иванов");
        employees.add("Мария Рыкова");
        employees.add("Анна Крутова");
        employees.add("Марина Лугова");
        employees.add("Анна Владимирова");
        employees.add("Петр Лыков");
        employees.add("Иван Мечников");
        employees.add("Петр Петин");
        employees.add("Петр Лыков");
        employees.add("Иван Ежов"); //23, 18

        System.out.println(employees);

        for (int i = 0; i < employees.size(); i++){

            if(nameToCount.containsKey(employees.get(i))){
                nameToCount.put(employees.get(i), nameToCount.get(employees.get(i)) + 1);
            }
            else{
                nameToCount.put(employees.get(i), 1);
            }
        }
        System.out.println(nameToCount);
    }
}
