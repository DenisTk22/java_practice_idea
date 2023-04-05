package lesson3;

import lesson3.homework3.Hwork3_4;

import java.util.ArrayList;
import java.util.List;

import static lesson3.homework3.Hwork3_4.differenceArray;
import static lesson3.homework3.Hwork3_4.simDifferenceArray;

public class Main {
    public static void main(String[] args) {
        //Task1.main();
//        ArrayList<String> poetry = new ArrayList<>();
//        poetry.add("Поэзия");
//        poetry.add("Евгений Онегин");
//        poetry.add("Облако в штанах");
//        ArrayList<String> prose = new ArrayList<>();
//        prose.add("Проза");
//        prose.add("Война и мир");
//        prose.add("Преступление и наказание");
//        Task2.filllibrary(poetry);
//        Task2.filllibrary(prose);
        //Task3.delIntFromList();

        //---Homework
        //Hwork3_2.deleteChet();
        //Hwork3_3.mathList();

        //differenceArray (List fArr, List sArr):


        List<Integer> A = Hwork3_4.arrayA();
        List<Integer> B = Hwork3_4.arrayB();
        System.out.println("First  Array: " + A);
        System.out.println("Second Array: " + B);

        List<Integer> D = differenceArray((ArrayList) A, (ArrayList) B);
        System.out.println("Difference (First - Second): " + D);
//        Hwork3_4.arrayA();
//        Hwork3_4.arrayB();
        List<Integer> Sm = simDifferenceArray((ArrayList) A, (ArrayList) B);
        System.out.println("Simmetric Difference: " + Sm);
    }
}
