/*
Name: Joshua Lobo
PRN: 21070126127
Batch: AIML B3

OS: Mac OS 12.2.1 Monterey
java Version: 19.0.1 2022-10-18
Java(TM) SE Runtime Environment (build 19.0.1+10-21)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.1+10-21, mixed mode, sharing)
*/

public class Main {
    public static void main(String[] args)
    {
        // Creating Instance of Display class
        //Creating the instance of Calculation object
        Calculation c = new Calculation();
        double[] result = c.result();
        System.out.println("-----------------------------");

        // Returning Output of the Function
        System.out.println("The Minimum Distance is : " + result[1]);
        System.out.println("The Index of First number is: " + result[0]);
    }
}