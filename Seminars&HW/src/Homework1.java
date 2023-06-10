import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) throws Exception {

        // Вычислить сумма чисел от 1 до n
        // System.out.println(sumOfNums(inputNum("Введите число -> ")));

        // Вывести все простые числа от 1 до 1000

        // primeNumbers();

        // Реализовать простой калькулятор

        // System.out.print(calculator());

        // Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
        // заменены знаком вопроса,
        // например, 2? + ?5 = 69. Требуется восстановить выражение до верного
        // равенства.
        // Предложить хотя бы одно решение или сообщить, что его нет.

        // equation(); // Ни в какую не могу решить эте задачу, первый раз за всё обучение!!!
        // Или устал или мозг кончился)))

    }

    private static int sumOfNums(int num) {
        int res = 0;
        for (int i = 1; i <= num; i++) {
            res += i;
        }
        return res;
    }

    private static int inputNum(String msg) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print(msg);
        return iScanner.nextInt();
    }

    private static String inputString(String msg) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print(msg);
        return iScanner.nextLine();
    }

    private static void printStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ";\t");
        }
        System.out.println();
    }

    private static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ";\t");
        }
        System.out.println();
    }

    private static void primeNumbers() {
        for (int num = 1; num <= 1000; num++) {
            boolean primeNum = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primeNum = false;
                    break;
                }
            }
            if (primeNum) {
                System.out.println(num);
            }

        }
    }

    private static int calculator() {
        int a = inputNum("Введите первое число -> ");
        String surOper = inputString("Введите знак действия -> ");
        int b = inputNum("Введите второе число -> ");
        int res = 0;
        switch (surOper) {
            case ("+"):
                res = a + b;
                break;
            case ("*"):
                res = a * b;
                break;
            case ("-"):
                res = a - b;
                break;
            case ("/"):
                res = a / b;
                break;
            default:
                System.out.println("Вы ввели неправильный знак!");
                break;
        }
        return res;

    }

    private static int[] collectingElements(String elem) {
        int[] thisEl = new int[elem.length() + 1];
        for (int i = 0; i < elem.length(); i++) {
            if (Character.isDigit(elem.charAt(elem.length() - 1 - i))) {
                int el = Character.digit(elem.charAt(elem.length() - 1 - i), 10);
                thisEl[elem.length() - 1 - i] = el;
                int k = i;
                while (k > 0) {
                    el *= 10;
                    k--;
                }
                
                thisEl[elem.length()] += el;
            } else {
                thisEl[i] = -1;
            }
        }
        return thisEl;

    }

    private static int elements(int[] array) {
        int elem = 0;
        for (int i = 0; i < array.length-1; i++) {
            int x = array[array.length - 2 - i];
            int k = i;
            while (k > 0) {
                x *= 10;
                k--;
            }  
            elem += x;
        }
        return elem;
    }

    private static void equation() {
        // String equ = inputString("Введите уравнение-> ");
        String[] equArr = { "2?", "+", "?5", "=", "69" }; // equ.split(" ");
        printStringArray(equArr);
        String q = equArr[0];
        String w = equArr[2];
        String e = equArr[4];
        if (e.matches("[-+]?\\d+")) {
            int sum = Integer.parseInt(e);
            int[] firstElArr = collectingElements(q);
            printIntArray(firstElArr);
            int[] secondElArr = collectingElements(w);
            printIntArray(secondElArr);
            int res = sum - (firstElArr[firstElArr.length - 1] + secondElArr[secondElArr.length - 1]);
            for (int i = firstElArr.length - 2; i >= 0; i--) {
                if (firstElArr[i] == -1 && secondElArr[i] != -1) {
                    firstElArr[i] = res % 10;                    
                } else {
                    if (firstElArr[i] != -1 && secondElArr[i] == -1) {
                        secondElArr[i] = res % 10;
                    } else {                        
                            firstElArr[i] = 1;
                            secondElArr[i] = res % 10 - 1;
                        }
                    }
                }
                res /= 10;
            System.out.println(elements(firstElArr)+" + "+ elements(secondElArr) + " = " + sum);
            }
            
        }
       
    }
