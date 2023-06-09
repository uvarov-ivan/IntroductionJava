import java.util.Random;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class Task2 {

    public static int[] genArray(int size, int maxNum) {
        Random rnd = new Random();
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = rnd.nextInt(maxNum);
        }
        printIntArray(newArray);
        return newArray;
    }

    public static Logger logging(String logFileName) {
        
        Logger logger = Logger.getLogger(Task2.class.getName());
        logger.setLevel(Level.FINE);
        logger.setUseParentHandlers(false);

       
        try {
            FileHandler fh = new FileHandler(logFileName);
            logger.addHandler(fh);

            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);
            SimpleFormatter sFormatter = new SimpleFormatter();
            fh.setFormatter(sFormatter);

            logger.addHandler(fh);

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logger;
    }

    public static int[] bubbleSort(int[] sortArr, Logger logger) {
        
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                    logger.info("Поменял местами " + j + "-й элемент " + sortArr[j + 1] + ", и " + (j + 1)
                            + "-й элемеснт " + sortArr[j]);
                }
            }
        }

        return sortArr;
    }

    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ";\t");
        }
        System.out.println();
    }
}
