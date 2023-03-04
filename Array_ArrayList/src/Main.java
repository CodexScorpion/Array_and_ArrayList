/*
Name: Joshua Lobo
PRN: 21070126127
Batch: AIML B3

OS: Mac OS 12.2.1 Monterey
java Version: 19.0.1 2022-10-18
Java(TM) SE Runtime Environment (build 19.0.1+10-21)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.1+10-21, mixed mode, sharing)
*/


//Importing Libraries

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Instantiate input array and array list classes
        InputArray a = new InputArray();
        InputArrayList l = new InputArrayList();

        // Store the returned array and array list
        String[] arr = a.inputArray();
        ArrayList<String> list = l.lists();

        // Create instance of shuffling class
        Shuffling s = new Shuffling();

        // Shuffle the elements in the array and array list
        s.listToArray(list);
        s.arrayToList(arr);
    }
}

