package examples.sorting_algorithms;

public class BubbleSort{
    static void bubbleSort(int [] arr) {
        int count = 0;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        needIteration = true;
                        count++;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("The number of permutations is " + count);
        System.out.println();
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] libraryNum = {124, 235, 456, 123, 756, 476, 285, 998, 379, 108};
        System.out.println();
        System.out.println("Initial Array");
        printArray(libraryNum);
        bubbleSort(libraryNum);
        System.out.println("Sorted Array");
        printArray(libraryNum);
    }
}
