package examples.sorting_algorithms;

public class MergeSort {
    static void mergeSort(int[]arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] items, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];
        for (int i = 0; i < leftSize; i++) {
            leftArr[i] = items[left + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArr[j] = items[mid + 1 + j];
        }

        // Maintain current index of sub-arrays and main array
        int i = 0, j = 0, k = left;

        // Untill we reach the end of either leftArr or rightArr, pick larger among
        // elements leftArr and rightArr and place them in the correct position at
        // items[left...right]
        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                items[k] = leftArr[i];
                i++;
            } else {
                items[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            items[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            items[k] = rightArr[j];
            j++;
            k++;
        }
    }

    static void printArray(int[] arr) {
        BubbleSort.printArray(arr);
    }

    public static void main(String[] args) {
        int[] libraryNum = {124, 235, 456, 123, 756, 476, 285, 998, 379, 108};
        System.out.println();
        System.out.println("Initial Array");
        printArray(libraryNum);
        mergeSort(libraryNum, 0, libraryNum.length - 1);
        System.out.println("Sorted Array");
        printArray(libraryNum);
    }
}
