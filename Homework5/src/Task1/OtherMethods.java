package Task1;

import java.util.HashMap;
import java.util.Scanner;

public class OtherMethods {

    public static String inputFromUser(String msg) { // Любимый модуль ввода сообшения
        System.out.print(msg + " -> ");
        Scanner str = new Scanner(System.in);
        return str.nextLine();
    }

    public static void printDecoration(int size) { // Оборачивает сообщения знаками "="
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("=");
        }
        System.out.println("\n");
    }

    public static void printArrayInt(int arr[]) { // Печатает массив int
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void printArrayStr(String arr[]) {// Печатает массив String
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static String indexToPlaceQueen(int nums, int letters) { //Меняет индексы массива на координаты шахматной доски
        String placeQueen = "";
        HashMap<Integer, String> dictLetters = new HashMap<>();
        dictLetters.put(0, "A");
        dictLetters.put(1, "B");
        dictLetters.put(2, "C");
        dictLetters.put(3, "D");
        dictLetters.put(4, "E");
        dictLetters.put(5, "F");
        dictLetters.put(6, "G");
        dictLetters.put(7, "H");
        placeQueen = dictLetters.get(letters) + Integer.toString(nums + 1);
        return placeQueen;
    }
}
