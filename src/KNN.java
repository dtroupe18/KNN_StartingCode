/**
 * Created by Dave on 5/15/17.
 */
public class KNN {
    private int k;
    private double[][] data;

    KNN(int k, double[][] data) {
        this.k = k;
        this.data = data;
    }

    private double euclideanDistance(double[] a, double[] b) {
        return 0.0;
    }

    private double[] getNeighbors(double[] row) {
        // return an array with the k closest points

        double[] neighbors = {0};
        return neighbors;
    }

    private int classify(double[] row) {
        return -1;
    }

    private void getAccuracy() {
        // something
    }


}
