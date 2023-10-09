import java.util.Scanner;
import java.util.Arrays;

public class MaxDifferenceFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Array of integers
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the maximum difference
        int maxDifference = findMaxDifference(array);

        // Output the result
        System.out.println("The maximum difference in the array is: " + maxDifference);
    }

    // Method to find the maximum difference in the array
    private static int findMaxDifference(int[] array) {
        // Sort the array in ascending order
        Arrays.sort(array);

        // Calculate the maximum difference
        int maxDifference = array[array.length - 1] - array[0];

        return maxDifference;
    }
}