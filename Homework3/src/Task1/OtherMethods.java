package Task1;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OtherMethods {
    
    public static int[] genArray(int size, int maxNum) {
        Random rnd = new Random();
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = rnd.nextInt(maxNum);
        }
        printIntArray(newArray);
        return newArray;
    }

    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка
    public static List<Integer> genList(int size) {
        List<Integer> res = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            res.add(rnd.nextInt(100));
        }
        return res;
    }
}
