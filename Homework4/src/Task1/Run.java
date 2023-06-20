package Task1;

import java.util.LinkedList;

public class Run {

    public static void program() {

        LinkedList<String> list = new LinkedList<>();
        boolean flag = true;

        while (flag) {
            String cmd = OtherMethodsHW4.inputFromUser("Введите сообщение");
            String[] cLine = cmd.toUpperCase().split("~");
            switch (cLine[0]) {
                case "EXIT":
                    flag = false;
                    break;
                case "PRINT":
                    System.out.println(list.get(Integer.parseInt(cLine[1])));
                    break;
                case "REVERS":
                    Revers.reversLinkedList(list);
                    break;
                case "LIST":
                    OtherMethodsHW4.printEllListAndDell(list);
                    break;
                default:
                    if (cLine.length > 1) {
                        OtherMethodsHW4.addToPos(cLine, list);
                    } else {
                        list.add(cLine[0]);
                    }
                    break;
            }
        }
    }
}
