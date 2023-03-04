//Importing Libraries

import java.util.Scanner;
public class InputArray {
    // Function to input the string of Array
    String[] inputArray()
    {
        String in;
        //Scanner object for User Input
        Scanner scan = new Scanner(System.in);
        int x;

        //User Input
        System.out.print("Enter the length of the Array: ");
        x = scan.nextInt();
        String[] arr = new String[x];
        System.out.println("---------------------------");
        System.out.println("Enter the Elements of Array: ");

        //For Loop to enter elements
        for (int i = 0; i < x; i++) {
            in = scan.next();
            arr[i] = in;

        }
        return arr; //Return array of strings entered by the user.
    }

}

