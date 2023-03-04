//Importing Libraries
import java.util.ArrayList;

public class Shuffling {
    void listToArray(ArrayList list) {
        // Converts an ArrayList into an Array
        int length = list.size();
        String[] arr = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = list.get(i).toString();
        }

        //Returns a converted Array
        System.out.print("Array post conversion from Array list is:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void arrayToList(String[] arr) {
        // Converts an Array to an ArrayList
        int length = arr.length;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            list.add(i, arr[i]);
        }

        //Returns a converted Array List
        System.out.print("The Array List after conversion from array is :");
        System.out.println(list);
    }
}


