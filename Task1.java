import java.util.ArrayList;
import java.util.List;

/**
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = createList(10, 0,50);
        System.out.println(list);
        changeList(list);
    }

    public static List<Integer> createList(int capacity, int min, int max){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            list.add((int)(Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    static void changeList (List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}