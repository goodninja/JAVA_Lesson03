// 1. Реализовать алгоритм сортировки слиянием.

package Task01;

import java.util.Arrays;
import java.util.Random;

public class task01 {
    public static void main(String[] args) {

        int[] processingArray = createArray();
        System.out.println("Новый массив: ");
        System.out.println(Arrays.toString(processingArray));
        int[] sortingArray = mergeArray(processingArray);
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(sortingArray));

    }

    
    public static int[] createArray() {
        int[] arr = new int[22];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int n = random.nextInt(100) - 30;
            arr[i] = n;
        }
        return arr;
    }


    public static int[] mergeArray(int[] processingArray) {
        int[] buffer1 = Arrays.copyOf(processingArray, processingArray.length);
        int[] buffer2 = new int[processingArray.length];
        int[] result = mergeSort(buffer1, buffer2, 0, processingArray.length);
        return result;
    }


    public static int[] mergeSort(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSort(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSort(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}