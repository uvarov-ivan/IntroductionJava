package Task1;

public class Program {

    public static void Run() {
        boolean flag = true; // Флаг для выхода из цикла.

        while (flag) {
            String cmd = OtherMethods.inputFromUser(
                    "Выберете команду:\nдобавить контакт - 1;\nраспечатать контакт - 2;\nраспечатать все контакты - 3;\nвыход - 0\n");
            switch (cmd) {
                case "1":
                    PhoneBook.addContact();
                    break;
                case "2":
                    PhoneBook.printContact();
                    break;
                case "3":
                    PhoneBook.printAllContacts();
                    break;
                case "0":
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
}
