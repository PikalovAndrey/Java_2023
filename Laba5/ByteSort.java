
import java.util.Arrays;

public class ByteSort {
    public static void main(String[] args) {
        byte[] a = {18, 0, -2, 18, 42, 44, -56, 23, 30, -86};
        byte[] b = {-43, 25, 11, -34, 21, -67, 0, 30, 28, -2};
        printBubbleSortedArray(a);
        printSelectionSortedArray(b);
    }

    static void bubbleSort(byte[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    byte temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void selectionSort(byte[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            byte temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    static void printBubbleSortedArray(byte[] arr) {
        byte[] sortedArr = Arrays.copyOf(arr, arr.length);
        bubbleSort(sortedArr);
        System.out.println("Provided array: " + Arrays.toString(arr) + "\n");
        System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(sortedArr) + "\n");
    }

    static void printSelectionSortedArray(byte[] arr) {
        byte[] sortedArr = Arrays.copyOf(arr, arr.length);
        selectionSort(sortedArr);
        System.out.println("Provided array: " + Arrays.toString(arr) + "\n");
        System.out.println("Sorted array using Selection Sort: " + Arrays.toString(sortedArr) + "\n");
    }
}
