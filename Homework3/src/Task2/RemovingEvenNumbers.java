package Task2;

import java.util.ArrayList;
import java.util.List;

public class RemovingEvenNumbers {
    public static int[] deleteEvenNum(int[] array) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                res.add(array[i]);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
