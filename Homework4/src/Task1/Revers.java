package Task1;

import java.util.LinkedList;
import java.util.ListIterator;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список

public class Revers {
    public static void reversLinkedList(LinkedList<String> list) {
        ListIterator<String> iter = list.listIterator(list.size());
        while (iter.hasPrevious()) {
            System.out.println(iter.previous());
        }
    }

    
}
