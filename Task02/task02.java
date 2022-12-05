// 2. Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package Task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task02 {
    public static void main(String[] args) {

        List<Integer> list = createRandList();
        System.out.println("Произвольный список целых чисел: ");
        System.out.println(list);

        List<Integer> result = deleteEvenNumbers(list);
    
        System.out.println("Список после удаления чётных чисел: ");
        System.out.println(result);

    }


    public static List<Integer> createRandList () {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 22; i++) {
            int n = random.nextInt(100) - 30;
            list.add(n);
        }
        return list;
    }


    public static List<Integer> deleteEvenNumbers (List<Integer> list) {
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        
        return list;

    }
}