import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {
        // Declare an array with 10 elements
        int[] arr = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};

        // Get the subarray from index 2 to 6 (inclusive)
        int[] subArray = Arrays.copyOfRange(arr, 2, 7);

        // Print the subarray
        System.out.print("Sub array: ");
        for (int num : subArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the 2nd highest number in the subarray
        int secondHighest = findSecondHighest(subArray);

        // Print the result
        System.out.println("2nd Highest element: " + secondHighest);
    }

    // Method to find the 2nd highest number
    private static int findSecondHighest(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : arr) {
            // Update highest and second highest
            if (num > highest) {
                secondHighest = highest; // Update second highest
                highest = num; // Update highest
            } else if (num > secondHighest && num < highest) {
                secondHighest = num; // Update second highest
            }
        }

        return secondHighest;
    }
}
