package george.algorithms.fun;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, 9, 18, 43, 22, 5, 14, 0, 1, -1};
        System.out.printf("Unsorted Array: %s\n", Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.printf("Sorted Array: %s\n", Arrays.toString(arr));
        System.out.println("Complexity: O(n * log n)");
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int start = mid - left + 1;
        int end = right - mid;

        int[] leftArr = new int[start];
        int[] rightArr = new int[end];

        System.arraycopy(arr, left, leftArr, 0, start);
        System.arraycopy(arr, mid + 1, rightArr, 0, end);

        int i = 0, j = 0, k = left;
        while (i < start && j < end) {
            arr[k++] = (leftArr[i] <= rightArr[j]) ? leftArr[i++] : rightArr[j++];
        }

        while (i < start) arr[k++] = leftArr[i++];
        while (j < end) arr[k++] = rightArr[j++];
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }
}
