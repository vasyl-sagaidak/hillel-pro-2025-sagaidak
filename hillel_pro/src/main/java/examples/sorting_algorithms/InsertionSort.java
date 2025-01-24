package examples.sorting_algorithms;

public class InsertionSort{
    static void insertionSort(int[] array) {
        int count = 0;
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int keyItem = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < keyItem) {
                array[j + 1] = array[j];
                j = j - 1;
                count++;
            }
            array[j+1] = keyItem;
        }
        System.out.println();
        System.out.println("The number of permutations is " + count);
        System.out.println();
    }

    static void printArray(int[] arr) {
        BubbleSort.printArray(arr);
    }

    public static void main(String[] args) {
        int[] libraryNum = {124, 235, 456, 123, 756, 476, 285, 998, 379, 108};
        System.out.println();
        System.out.println("Initial Array");
        printArray(libraryNum);
        insertionSort(libraryNum);
        System.out.println("Sorted Array");
        printArray(libraryNum);
    }
}
