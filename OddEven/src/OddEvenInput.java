//Importing Libraries
import java.util.Scanner;

public class OddEvenInput{
    int[] getInputArray() {

        //Scanner Method to take User Input
        Scanner scan = new Scanner(System.in);

        //User Input
        System.out.print("Enter Size of Array: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        //For Loop to move to next element
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Element at index " + i + ": ");
            array[i] = scan.nextInt();
        }

        return array;
    }
}