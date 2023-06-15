import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Sem2_2 {
    public static List<String> fileNames(String dirPath) {
        System.out.println("Start");
        List<String> fNames = new ArrayList<>();
        File directory = new File(dirPath);
        if (directory.isDirectory()) {
            System.out.println("Yes");
            for (File item : directory.listFiles()) {
                fNames.add(item.getName());
                try {
                    System.out.println(item.getName().substring(item.getName().lastIndexOf(".")));
                } catch (Exception e) {
                    System.out.println("Папка");
                }
            }
        }
        return fNames;
    }
    public static void writeToFileLists(List<String> files, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)){
            for (String item : files) {
                writer.write(item);
                writer.write(System.lineSeparator());
            }
            System.out.println("Готово!");
        } catch (Exception e) {
            
        }
        
    }

}
