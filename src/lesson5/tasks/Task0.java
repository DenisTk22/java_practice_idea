//

package lesson5.tasks;

import java.util.HashMap;
import java.util.Map;

public class Task0 {
    private static final Map<Integer, String> passportToName = new HashMap<>();
    //static Logger logger = Logger.getLogger(Task0.class.getName());
    public static void run(){

        passportToName.put(123456, "Иванов");
        passportToName.put(123457, "Васильев");
        passportToName.put(123458, "Петрова");
        passportToName.put(123459, "Иванов");
        passportToName.put(123455, "Петрова");
        passportToName.put(123454, "Иванов");

        //logger.info((Supplier<String>) passportToName);
        System.out.println(passportToName);

        for (Map.Entry<Integer, String> entry: passportToName.entrySet()) {
                 if(entry.getValue().equals("Иванов")) {
                     System.out.println(entry);

        }

        }
    }




}
