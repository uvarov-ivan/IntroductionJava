package Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    private static HashMap<String, List<String>> pb = new HashMap<>(); // Создали пустую телефонную книгу, номера в
                                                                       // формате строки, т.к. могут начинаться с "+7".

    public static void addContact() { // Добавляем контакт в книгу.
        String name = OtherMethods.inputFromUser("Введите имя контакта");
        String correctlyName = name.substring(0, 1).toUpperCase() +
                                 name.substring(1, name.length()).toLowerCase();// Преобразует имя в норманое написание
        String phoneNum = OtherMethods.inputFromUser("Введите номер телефона");
        if (pb.containsKey(correctlyName)) {
            pb.get(correctlyName).add(phoneNum);
            String printString = "Телефонный номер " + phoneNum + "к контакту " + correctlyName + " добавлен!";
            OtherMethods.printDecoration(printString.length());
            System.out.println(printString);
            OtherMethods.printDecoration(printString.length());
        } else {
            List<String> pn = new ArrayList<>();
            pn.add(phoneNum);
            pb.put(correctlyName, pn);
            String printString = "Контакт " + correctlyName + " создан!";
            OtherMethods.printDecoration(printString.length());
            System.out.println(printString);
            OtherMethods.printDecoration(printString.length());

        }
    }

    public static void printContact() {// Печатает выбранный контакт, если не найдёт - выдаст ошибку.
        String name = OtherMethods.inputFromUser("Введите имя контакта");
        String correctlyName = name.substring(0, 1).toUpperCase() + name.substring(1, name.length()).toLowerCase();
        if (pb.containsKey(correctlyName)) {
            String printString = "Телефонные номера контакта " + correctlyName + ":";
            OtherMethods.printDecoration(printString.length());
            System.out.println(printString);
            for (int i = 0; i < pb.get(correctlyName).size(); i++) {
                System.out.println(pb.get(correctlyName).get(i) + ";");
            }
            OtherMethods.printDecoration(printString.length());
        } else {
            String printString = "Контакт с именем " + correctlyName + " не найден!";
            OtherMethods.printDecoration(printString.length());
            System.out.println(printString);
            OtherMethods.printDecoration(printString.length());
        }

    }

    public static void printAllContacts() {// Печатает все контакты со всеми их номерами.
        for (String name : pb.keySet()) {
            String printString = "Телефонные номера контакта " + name + ":";
            OtherMethods.printDecoration(printString.length());
            System.out.println(printString);
            for (int i = 0; i < pb.get(name).size(); i++) {
                System.out.println(pb.get(name).get(i) + ";");
            }
            OtherMethods.printDecoration(printString.length());
        }
    }
}
