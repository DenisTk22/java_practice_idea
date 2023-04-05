//Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое этого списка.

package lesson3.homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hwork3_3 {
    public static void mathList() {
        List<Integer> listOfNumbers = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            listOfNumbers.add(random.nextInt(10));
        }
        System.out.println(listOfNumbers);

        int minN = listOfNumbers.get(0);
        int maxN = listOfNumbers.get(0);
        double sum = 0;
        for (int i = 0; i < listOfNumbers.size(); i++){
            if (listOfNumbers.get(i) < minN){
                minN = listOfNumbers.get(i);
            }
        }
        for (int i = 0; i < listOfNumbers.size(); i++){
            if (listOfNumbers.get(i) > maxN){
                maxN = listOfNumbers.get(i);
            }
        }
        for (int i = 0; i < listOfNumbers.size(); i++){
            sum += listOfNumbers.get(i);
        }
        double asum = sum / (listOfNumbers.size());
        System.out.println("минимальное = " + minN + "\n" + "максимальное = " + maxN + "\n" + "среднее арифметическое = " + asum);
    }
}
