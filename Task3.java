import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
 * Вывести название каждой планеты и количество его повторений в списке.
 */
public class Task3 {
    public static void main(String[] args) {
        createList();
    }

    static void createList() {
        Scanner iscanner = new Scanner(System.in);

        Object[][] planetsSunSys = new Object[][] {
                { "Меркурий", 0 }, { "Венера", 0 }, { "Земля", 0 }, { "Марс", 0 },
                { "Юпитер", 0 }, { "Сатурн", 0 }, { "Уран", 0 }, { "Нептун", 0 }, { "Плутон", 0 }
        };

        System.out.println("Введите колличество планет: ");
        int cntPlanet = iscanner.nextInt();

        List<Object> planetList = new ArrayList<>();
        for (int i = 0; i < cntPlanet; i++) {
            int idxPlanet = (int) (Math.random() * (8 - 0 + 1) + 0);
            planetList.add(planetsSunSys[idxPlanet][0]);
            fillList(planetsSunSys, (String) planetsSunSys[idxPlanet][0]);
        }

        System.out.println(planetList);
        printCntPlanet(planetsSunSys);
    }

    static void fillList(Object[][] arrPlan, String planet) {
        for (int i = 0; i < arrPlan.length; i++) {
            if (arrPlan[i][0].equals(planet)) {
                arrPlan[i][1] = (int) arrPlan[i][1] + 1;
            }
        }
    }

    static void printCntPlanet(Object[][] arrPlan) {
        for (int i = 0; i < arrPlan.length; i++) {
            if ((int) arrPlan[i][1] > 0) {
                System.out.println(arrPlan[i][0] + " встречается " + arrPlan[i][1] + " раз/а.");
            }
        }
    }
}