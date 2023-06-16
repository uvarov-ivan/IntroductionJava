import Task1.MergeSort;
import Task1.OtherMethods;
import Task2.RemovingEvenNumbers;
import Task3.SearchAverage;

public class App {
    public static void main(String[] args) throws Exception {
        OtherMethods.printIntArray(MergeSort.mergeSort(OtherMethods.genArray(5,100)));
        OtherMethods.printIntArray(RemovingEvenNumbers.deleteEvenNum(OtherMethods.genArray(20, 100)));
        SearchAverage.name(OtherMethods.genList(50));
    }
}
