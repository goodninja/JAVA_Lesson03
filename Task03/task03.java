// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

package Task03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task03 {
    public static void main(String[] args) {

        List<Integer> list = createRandList();
        System.out.println("Задан целочисленный список ArrayList: " + list);


        int min = list.get(0);
        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }
        System.out.printf("Минимальное значение = %d\n", min);

        int max = list.get(0);
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        System.out.printf("Максимальное значение = %d\n", max);

        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        double avg = sum / list.size();
        System.out.printf("Среднее значение = %.2f\n", avg);
    }


    public static List<Integer> createRandList() {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 22; i++) {
            int n = random.nextInt(20) - 12;
            list.add(n);
        }
        return list;
    }
}