import java.util.Scanner;

public class BinarySearch {

    // Function to perform binary search
    public static int binarySearch(int[] array, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is at mid
            if (array[mid] == target) {
                return mid;
            }

            // If the target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        // Input sorted array elements
        System.out.println("Enter " + size + " sorted elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Input the target element to search
        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();

        // Perform binary search
        int result = binarySearch(array, 0, size - 1, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}
