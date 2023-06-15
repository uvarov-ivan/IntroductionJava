

public class App1 {
    public static void main(String[] args) throws Exception {
        System.out.println(Task1.convertStr("name:Ivanov, country:Russia, city:Moscow, age:null"));
        Task2.logging();
        System.out.println(Task3.combiningLine(Task3.readFileInList("text.txt")));
        Task4.loggingCalk();
    }
}