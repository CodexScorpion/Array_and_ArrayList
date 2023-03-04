//Importing Libraries
import java.util.ArrayList;
import java.util.Scanner;

public class InputArrayList {
    // Function to input Array List

    ArrayList<String> lists() {
        // Input for length & elements of the ArrayList
        ArrayList<String> list = new ArrayList<String>();
        int x;

        //User Input
        System.out.print("Enter length of Array list: ");
        x = scan.nextInt();
        System.out.println("---------------------------");
        System.out.println("Enter the elements of Array List: ");

        //For Loop to take User Input
        for (int i = 0; i < x; i++) {
            String in = new String();
            in = scan.next();
            list.add(i, in);
        }
        return list; //  Returns ArrayList of strings entered by the user.
    }

    Scanner scan = new Scanner(System.in);   //Scanner object for User Input
}


