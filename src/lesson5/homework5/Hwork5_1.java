//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package lesson5.homework5;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hwork5_1 {

    public static void run(){
        Map<String, List<String>> nameToPhone = new HashMap<>();

        nameToPhone.put("Иван", Arrays.asList("+78956345125", "+78957785111"));
        nameToPhone.put("Макс", Arrays.asList("+78989545566"));
        nameToPhone.put("Коск", Arrays.asList("+78984596332"));
        nameToPhone.put("Жук", Arrays.asList("+78956115789", "+78954455895"));

        System.out.println(nameToPhone);
    }
}