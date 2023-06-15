// Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: 
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static String[] readFileInList(String fileName) {

        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }

        catch (IOException e) {
             e.printStackTrace();
        }
        String[] fuck = lines.toString().replace("[", "").replace("]", "").replace("{", "").replace("}", "").split(",");
        
        return fuck;
    }


    public static String combiningLine(String[] lines) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            String key = lines[i].split(":")[0].replace('"', '-').replace("-", "");
            String value = lines[i].split(":")[1].replace('"', '-').replace("-", "");
            switch (key) {
                case ("фамилия"):
                    sb.append("Студент " + value);
                    break;
                case ("оценка"):
                    sb.append(" получил оценку " + value);
                    break;
                case ("предмет"):
                    sb.append(" по предмету " + value + ".\n");
                    break;
                default:
                    System.out.println("Ошибка!");
                    break;
            }
        }
        return sb.toString();
    }
}