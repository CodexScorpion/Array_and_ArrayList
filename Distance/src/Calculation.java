import java.lang.Math;

public class Calculation {
    double[] result() {
        // Creating object of InputDistance class
        InputDistance d = new InputDistance();
        double[] arr = d.getDistances();
        double[] finalArr = new double[2]; //This array is for returning the minIndex and minDistance;
        double minDistance = 0;
        double minIndex = 0;

        // Loop through the array and compute the minimum difference between adjacent elements
        for (int i = 0; i < arr.length - 1; i++) {
            double difference = Math.abs(arr[i] - arr[i + 1]);
            if (i == 0 || difference < minDistance) {
                minDistance = difference;
                minIndex = i;
            }
        }
        finalArr[0] = minIndex;
        finalArr[1] = minDistance;

        return finalArr; // Return the final array with minimum index and distance
    }
}