import java.util.Arrays;
import java.util.HashSet;

import LaptopLibrary.Laptops;

public class App {
    public static void main(String[] args) throws Exception { // создаю эллементы класса НОУТБУК
        Laptops lenovo = new Laptops(1, "Lenovo Y580", 25000, "Windows 10 pro", "Intel(R) Core(TM) i5-3210M CPU", "SSD",
                445, 8);
        Laptops apple = new Laptops(2, "Macbook Pro Late 2021", 273000, "MacOS Monterey", "M1 Pro", "SSD", 1024, 16);
        Laptops aser = new Laptops(3, "Acer Aspire 5 A517-53-743Z", 94194, "без ОС", "Intel Core i7", "SSD", 512, 16);
        Laptops lenovo2 = new Laptops(4, "Lenovo Y580", 25000, "Windows 10 pro", "Intel(R) Core(TM) i5-3210M CPU",
                "SSD", 445, 8);
        System.out.println(lenovo + "\n");// печатаю выбранные элементы
        System.out.println(apple + "\n");
        System.out.println(aser + "\n");
        var lt = new HashSet<Laptops>(Arrays.asList(lenovo, apple, aser)); // содаю множество эллементов
        System.out.println(lenovo.equals(lenovo2)); //сравниваю эллементы
        System.out.println(lenovo.equals(apple));
        System.out.println(lt.contains(lenovo)); // проверяю множество на наличие конкретного эллемента

    }
}
