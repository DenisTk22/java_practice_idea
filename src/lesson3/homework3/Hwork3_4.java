//Реализовать разность массивов и симметрическую разность.
//1) разность массивов - все элементы A, не входящие в B (пример [1,2,3,3,3,4,5,6] \ [0,2,2,3,3,4,5,7,8,9] -> [1,6]);
//2) симметрическую разность - все элементы A и B, которые не принадлежат одновременно обоим массивам
//(пример [1,2,3,3,3,4,5,6] Δ [0,2,2,3,3,4,5,7,8,9] -> [0,1,6,7,8,9]).

package lesson3.homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hwork3_4 {
    // Формируем два массива А и В типа Integer
    public static ArrayList arrayA () {
        List<Integer> arrayFirst = new ArrayList<>();
        Random randomF = new Random();
        for (int i = 0; i < 5; i++) {
            arrayFirst.add(randomF.nextInt(10));
        }
        //System.out.println("First  Array: " + arrayFirst);

        return new ArrayList(arrayFirst);
    }

    public static ArrayList arrayB () {

        List<Integer> arraySecond = new ArrayList<Integer>();
        Random randomS = new Random();
        for (int i = 0; i < 5; i++) {
            arraySecond.add(randomS.nextInt(10));
        }
        //System.out.println("Second Array: " + arraySecond);
        return new ArrayList(arraySecond);
    }


    //Получаем разницу массивов А и В
    public static ArrayList differenceArray (ArrayList fArr, ArrayList sArr){  //differenceArray / (ArrayList fArr, ArrayList sArr)

        List<Integer> arrayDiff = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < fArr.size(); i++){
            for (int j = 0; j <sArr.size(); j++){

                if (fArr.get(i) != sArr.get(j)) {
                    count +=1;
                }
            }
            if (count == fArr.size()){
                int a = (int) fArr.get(i);
                arrayDiff.add(a);
            }
            count = 0;
        }

        return new ArrayList(arrayDiff);
    }

    // Получаем симметричную разницу массивов А и В
    public static ArrayList simDifferenceArray (ArrayList fArr, ArrayList sArr) {
        List<Integer> arrayDiffAB = new ArrayList<Integer>();
        List<Integer> arrayDiffBA = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < fArr.size(); i++){
            for (int j = 0; j <sArr.size(); j++){

                if (fArr.get(i) != sArr.get(j)) {
                    count +=1;
                }
            }
            if (count == fArr.size()){
                int a = (int) fArr.get(i);
                arrayDiffAB.add(a);
            }
            count = 0;
        }

        for (int i = 0; i < sArr.size(); i++){
            for (int j = 0; j <fArr.size(); j++){

                if (sArr.get(i) != fArr.get(j)) {
                    count +=1;
                }
            }
            if (count == sArr.size()){
                int a = (int) sArr.get(i);
                arrayDiffBA.add(a);
            }
            count = 0;
        }
        List<Integer> arrayC = new ArrayList<>(arrayDiffAB);
        arrayC.addAll(arrayDiffBA);

        return new ArrayList(arrayC);
    }
}


