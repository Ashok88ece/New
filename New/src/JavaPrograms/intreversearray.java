package JavaPrograms;

import java.util.Arrays;

public class intreversearray {
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Reverse the array
        reverseArray(arr);

        // Print the reversed array
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    // Method to reverse the array
    public static void reverseArray(int[] arr) {
        int start = 0;               // Start index
        int end = arr.length - 1;     // End index

        // Loop to swap elements from start to end
        while (start < end) {
            // Swap the elements at the start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the indices towards the center
            start++;
            end--;
        }
    }
}
