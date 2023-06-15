// import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
// import java.io.PrintWriter;

public class Sem2_1 {
    public static String genLine(String line, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append(line);
        }
        return res.toString();
    }



public static void writeToFileStrings(String fileName, String text) {
    // File file = new File(fileName);
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
        bw.write(text);
    } catch(IOException e){
        e.printStackTrace();
    }
}
}