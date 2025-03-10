package lesson_19_Algorythms.homework;

import java.util.Arrays;

public class ArrayUtils {

    public static void main(String[] args) {
        int[] numsArr = {92, 11, 3, 0, 47, 18, 31, 17, 29, 88, 133};
        mergeSort(numsArr, 0, numsArr.length - 1);
        System.out.println(Arrays.toString(numsArr));

        int i = binarySearch(numsArr, 31);
        System.out.println(i);

    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] items, int left, int mean, int right) {
        int leftSize = mean - left + 1;
        int rightSize = right - mean;
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = items[left + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = items[mean + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                items[k] = leftArray[i];
                i++;
            } else {
                items[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            items[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            items[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == array[mid]) {
                return mid;
            }

            if (target > array[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
