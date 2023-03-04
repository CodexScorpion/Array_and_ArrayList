//Importing Libraries
import java.util.Scanner;
public class InputDistance {
    // Method to take input of an Array of Doubles
    Scanner scan = new Scanner(System.in);
    double[] getDistances() {

        //User Input
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        System.out.println("----------------------------");

        // Array to store distances
        double[] distances = new double[n];

        //For Loop to go through the indexes
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            distances[i] = scan.nextDouble();
        }

        return distances;
    }
}
