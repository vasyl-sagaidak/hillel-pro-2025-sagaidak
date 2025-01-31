package examples.leetcode_daily_practice.arrays.remove_element;

import java.util.Arrays;

public class RemoveElementTaskMain {
    public static void main(String[] args) {
        //System.out.println(removeElement(new int[]{}, 0));
        // System.out.println(removeElement(new int[]{2}, 3));
         //System.out.println(removeElement(new int[]{3, 3}, 5));
        // System.out.println(removeElement(new int[]{3,2,2,3}, 3));
        // System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
        // System.out.println(removeElement(new int[]{0,3,1,1,0,1,3,0,3,3,1,1}, 1));
       // System.out.println(removeElement(new int[]{2,2}, 1));
        // System.out.println(removeElement(new int[]{1,2,3,4}, 1));
        int[][] arrays = new int[][] {
                {}, //0
                {2}, //1
                {2,2}, //2
                {3,3}, //3
                {3,2,2,3}, //4
                {0,1,2,2,3,0,4,2}, //5
                {0,3,1,1,0,1,3,0,3,3,1,1}, //6
                {1,2,3,4} //7
        };
        int[] vals = {0,3,1,5,3,2,1,1};

        for (int i = 7; i < arrays.length; i++) {
            System.out.println("Array looking BEFORE method invocation:" + Arrays.toString(arrays[i]));
            System.out.println("Val value is: " + vals[i]);
            System.out.println("Non val elements in Array: " + removeElement(arrays[i], vals[i]));
            System.out.println("Array looking AFTER method invocation: " + Arrays.toString(arrays[i]));
            System.out.println("==================");
        }
    }

    // Какие в данной задаче основные нюансы?
    // Нам необходимо в массиве nums убрать все значения равные val в конец массива,
    // и вернуть из метода целое число представляющее собой количество значений которые не равны val.
    //
    //

    public static int removeElement(int[] nums, int val) {
        if (nums.length != 0) {
            Arrays.sort(nums);
            if (Arrays.binarySearch(nums,val) < 0) {
                return nums.length;
            }

            int left = 0;
            int right = nums.length - 1;

            while (nums[left] != val) {
                left++;
            }
            while (left < right) {
                if (nums[left] == val) { // вечный цикл?
                    if (nums[right] != val) {
                        int temp = nums[right];
                        nums[right] = nums[left];
                        nums[left] = temp;
                        left++;
                        right--;
                        if (nums[left] == val && left == right) {
                            break;
                        }
                    } else {
                        while (val == nums[right]) {
                            right--;
                            if (nums[left] == nums[right]) {
                                break;
                            } else {
                                int temp = nums[right];
                                nums[right] = nums[left];
                                nums[left] = temp;
                                left++;
                                right--;
                            }
                        }
                    }
                }
            }
            int result = 0;
            for (int n : nums) {
                if (n != val) {
                    result++;
                }
            }
            return result;
        }
        return 0;
    }

//    public static int removeElement(int[] nums, int val) {
//        int left = 0;
//        int right = nums.length - 1;
//        while (left < right) {
//            if (nums[left] == val) {
//                if (nums[right] != val) {
//                    int temp = nums[right];
//                    nums[right] = nums[left];
//                    nums[left] = temp;
//                    left++;
//                    right--;
//                } else {
//                    int temp = nums[--right];
//                    nums[right] = nums[left];
//                    nums[left] = temp;
//                    left++;
//                }
//            } else {
//                left++;
//            }
//        }
//        int result = 0;
//        for (int e : nums) {
//            if (e != val) {
//                result++;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//        return result;
//    }
}
