package george.algorithms.fun;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 5, 15, 20, 22, 13, 45, 89, 102, 111, 128, 145, 252, 373, 665};
        int desiredNumber = 111;
        int desiredNumberIndex = 0;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (arr[middle] == desiredNumber) {
                desiredNumberIndex = middle;
                break;
            }

            if (desiredNumber > arr[middle]) {
                start = middle + 1;
            }

            if (desiredNumber < arr[middle]) {
                end = middle - 1;
            }

        }

        System.out.printf("The desired number (%d) index is: %d", desiredNumber, desiredNumberIndex);
        System.out.println("Complexity: O(log n)");


    }
}
