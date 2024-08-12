package george.algorithms.fun;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 2, 1, 15, -1, 9, 8};
        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Complexity: O(n^2)");
    }
}
