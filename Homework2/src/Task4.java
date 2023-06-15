// К калькулятору из предыдущего ДЗ добавить логирование

import java.util.Scanner;
import java.util.logging.Logger;

public class Task4 {

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

    public static int calculator(Logger logger) {
        int a = inputNum("Введите первое число -> ");
        String surOper = inputString("Введите знак действия -> ");
        int b = inputNum("Введите второе число -> ");
        int res = 0;
        switch (surOper) {
            case ("+"):
                res = a + b;
                logger.info("Выполнил сложение " + a + " и " + b + " и в результате получил " + res + ";");
                break;
            case ("*"):
                res = a * b;
                logger.info("Выполнил умножение " + a + " на " + b + " и в результате получил " + res + ";");
                break;
            case ("-"):
                res = a - b;
                logger.info("Выполнил вычитание " + b + " из " + a + ", в результате получил " + res + ";");
                break;
            case ("/"):
                res = a / b;
                logger.info("Выполнил деление " + a + " на " + b + " и в результате получил " + res + ";");
                break;
            default:
                System.out.println("Вы ввели неправильный знак!");
                break;
        }
        return res;

    }
}
