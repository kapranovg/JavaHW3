import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее арифметическое из этого списка. 
 * Collections.max()
 */

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = createList(10, 0, 100);
        System.out.println(list);
        System.out.println("Max = " + Collections.max(list));
        System.out.println("Min = " + Collections.min(list));
        double middleArifmetic = 0;
        for (Integer integer : list) {
            middleArifmetic += integer;
        }
        System.out.println("Middle = " + middleArifmetic / list.size());
    }    
    public static List<Integer> createList(int capacity, int min, int max){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            list.add((int)(Math.random() * (max - min + 1) + min));
        }
        return list;
    }
}