/**
 * Created by Dave on 5/15/17.
 */
public class Tester {
    public static void main(String[] args) {
        double[][] trainingData = DataSetup.loadData("wineTrain.csv");
        DataSetup.printData(trainingData);

        System.out.println("\n___________________________________________________");
        double[][] testingData = DataSetup.loadData("wineTest.csv");
        DataSetup.printData(testingData);
    }
}