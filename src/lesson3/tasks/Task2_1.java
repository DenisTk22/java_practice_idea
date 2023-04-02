//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.

package lesson3.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task2_1 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Mercury");
        ArrayList<Integer> countPlanets = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();
        for (String planet: planets) { // бежим по списку планет
            int position = resultList.indexOf(planet); // возвращвет индекс, планеты, которую нашел, если пусто, то вернет -1
            if (position >= 0) {
                countPlanets.set(position, countPlanets.get(position) + 1); //подучаем позицию и + 1
        } else {
                resultList.add(planet);
                countPlanets.add(1);
            }

        }
        printPlanetCount(resultList, countPlanets);
    }
    private static void printPlanetCount(List<String> planets, List<Integer> counts) {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%-10s : %3d%n", planets.get(i), counts.get(i)); // 10 - кол-во пробелов до :/ 3 - кол-во пробелов после :
        }
    }
}
