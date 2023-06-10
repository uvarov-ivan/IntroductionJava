import java.time.LocalTime;
import java.util.Scanner;

public class Seminar1 {

    public static void main(String[] args) throws Exception {

        task1();
        task2();
        task3();
        String[] lines = {"домовой", "дом", "домашний" };
        System.out.println(findPref(lines) + " " + lines[0].substring(0, findPref(lines)));

    }

    private static void task1() {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.println("Введите ваше имя-> ");

            String name = iScanner.nextLine();
            task11(name);
        }

        // System.out.println("Hello " + name);
    }

    private static void task11(String name) {
        LocalTime timeOfDay = LocalTime.now();
        System.out.println(timeOfDay);
        if (timeOfDay.getHour() >= 5 && timeOfDay.getHour() < 12) {
            System.out.println("Good morning " + name);
        }
        if (timeOfDay.getHour() >= 12 && timeOfDay.getHour() < 17) {
            System.out.println("Good afternoon " + name);
        }
        if (timeOfDay.getHour() >= 17 && timeOfDay.getHour() < 23) {
            System.out.println("Good evening " + name);
        }
        if (timeOfDay.getHour() >= 23 || timeOfDay.getHour() < 5) {
            System.out.println("Good night " + name);
        }

    }

    private static void task2() {
        int[] myArray = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1 };
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }

        }

        if (count > maxCount) {
            maxCount = count;
        }

        System.out.println(maxCount);
    }

    private static void task3() {
        int[] myArray = { 3, 2, 4, 3, 2, 5, 3 };
        int num = 3;
        int endInd = myArray.length - 1;

        for (int i = 0; i < endInd; i++) {
            if (myArray[i] == num) {
                while (myArray[endInd] == num && i + 1 != endInd) {
                    endInd--;
                }
                int x = 0;
                x = myArray[endInd];
                myArray[endInd] = myArray[i];
                myArray[i] = x;
            }
        }
        printArray(myArray);

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    private static int findPref(String[] array) {
        int res = 0;
        boolean prfExit = true;

        while (prfExit) {
            res++;
            for (int i = 0; i < array.length - 1; i++) {
                
                if (array[i].length() < res || array[i + 1].length() < res
                        || array[i].substring(0, res).compareTo(array[i + 1].substring(0, res)) != 0) {
                    res--;
                    prfExit = false;
                    break;
                }
            }
        }
        return (res);
    }
}