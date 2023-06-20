package Task2;

import java.util.LinkedList;

import Task1.OtherMethodsHW4;


// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class LinkedListQueue {

    private static LinkedList<String> list = new LinkedList<>();

    public static void  enqueue() {
        String addedElem = OtherMethodsHW4.inputFromUser("Введите эллемент");
        list.addLast(addedElem);
    }

    public static void dequeue() {
        System.out.println(list.pop());
        
    }

    public static void first() {
        System.out.println(list.peek());
        
    }

}
