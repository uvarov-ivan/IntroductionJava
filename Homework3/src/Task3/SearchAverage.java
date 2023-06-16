package Task3;

import java.util.Collections;
import java.util.List;

public class SearchAverage {
    public static void name(List<Integer> list) {
        
        System.out.println("Минимальным числом списка является " + Collections.min(list));
        int count = 0;
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
            count++;
        }
        int avarege = sum/count;
        int difference = Collections.max(list);
        int avaregeNum = Collections.min(list);
        for (Integer integer : list) {
            if (Math.abs(integer - avarege) < difference) {
                difference = Math.abs(integer - avarege);
                avaregeNum = integer;
            }
        }
        System.out.println("Ближайшим к среднему значению числом списка является " + avaregeNum);
        System.out.println("Максимальным числом списка является " + Collections.max(list));
    }
}
