import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        // Creating instance of the InputArray class
        OddEvenInput inputArray = new OddEvenInput();
        int[] list = inputArray.getInputArray();

        // Initializing even and odd arrays
        int[] even = new int[list.length];
        int[] odd = new int[list.length];

        // Initializing even and odd indexes
        int evenIndex = 0;
        int oddIndex = 0;

        // Separating even and odd numbers
        for (int num : list) {
            if (num % 2 == 0) {
                even[evenIndex] = num;
                evenIndex++;
            } else {
                odd[oddIndex] = num;
                oddIndex++;
            }
        }

        // Removing unnecessary elements from even and odd arrays
        even = Arrays.copyOf(even, evenIndex);
        odd = Arrays.copyOf(odd, oddIndex);

        // Printing the even and odd arrays
        System.out.println("The Even array is: " + Arrays.toString(even));
        System.out.println("The Odd array is: " + Arrays.toString(odd));
    }
}