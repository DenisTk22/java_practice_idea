//Пусть дан произвольный список целых чисел, удалить из него чётные числа

package lesson3.homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hwork3_2 {
    public static void deleteChet() {
        List<Integer> listOfNumbers = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listOfNumbers.add(random.nextInt(10));
        }
        System.out.println(listOfNumbers);
        for (int i = 0; i < listOfNumbers.size(); i++){
            if (listOfNumbers.get(i) % 2 == 0 && listOfNumbers.get(i) !=0){
                listOfNumbers.remove(i);
                i--;
            }
        }
        System.out.println(listOfNumbers);
    }
}
