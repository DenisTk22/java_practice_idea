//Дана строка json:
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.

package lesson2.homework;

public class Hwork2 {
    public static void jurnal() throws Exception {

        String jsonS = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, " +
                " {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
                " {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        String s1 = jsonS.replace("[", "");
        String s2 = s1.replace("]", "");
        String s3 = s2.replace("\"", "");
        String s4 = s3.replace("}", "");
        String s5 = s4.replace("{", "");

        String[] arrayJsonS = s5.split(", ");

        StringBuilder str = new StringBuilder();

        String[] listName = {"Студент ", " получил ", " по предмету "};

            for (int i = 0; i < arrayJsonS.length; i++) {
                String[] arrString = arrayJsonS[i].split(",");
                for (int j =0; j < arrString.length; j++) {
                    String[] arrStr = arrString[j].split(":");
                    str.append(listName[j]);
                    str.append(arrStr[1]);
                }
                str.append(".\n");
            }
        System.out.println(str);
        }
    }

