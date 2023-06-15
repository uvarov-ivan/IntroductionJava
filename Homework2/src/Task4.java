// К калькулятору из предыдущего ДЗ добавить логирование

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

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

    public static void loggingCalk() {

        Logger logger = Logger.getLogger(Task4.class.getName()); // Указываем имя вашего класса
        logger.setLevel(Level.FINE);
        logger.setUseParentHandlers(false); // отключаем передачу в родителя

        // Подключаем хендлер
        try {
            FileHandler fh = new FileHandler("logCalc.txt");
            logger.addHandler(fh);

            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);
            SimpleFormatter sFormatter = new SimpleFormatter();
            fh.setFormatter(sFormatter);

            logger.addHandler(fh);

            System.out.println(calculator(logger));
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static int calculator(Logger logger) {
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
