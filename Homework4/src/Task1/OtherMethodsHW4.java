package Task1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class OtherMethodsHW4 {

    public static String inputFromUser(String msg) {
        System.out.print(msg + " -> ");
        Scanner str = new Scanner(System.in);
        return str.nextLine();
    }

    public static boolean isInt(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static List<String> addToPos(String[] splitted, List<String> list) {
        if (isInt(splitted[1])) {
            int num = Integer.parseInt(splitted[1]);
            if (num > list.size()) {
                for (int i = list.size(); i < num; i++) {
                    list.add(" ");
                }
            }
            list.add(num,splitted[0]);
        }
        return list;
    }

    public static void printEllListAndDell(LinkedList<String> list) {
        while (list.size() > 0) {
            System.out.println(list.pop());
        }
    }


    public static LinkedList<Integer> genLinkedList(int size) {
        Random rnd = new Random();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            ll.add(rnd.nextInt(100));
        }
        return ll;
    }
}
