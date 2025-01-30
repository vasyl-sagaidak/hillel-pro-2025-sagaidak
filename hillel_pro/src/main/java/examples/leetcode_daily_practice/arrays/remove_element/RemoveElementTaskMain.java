package examples.leetcode_daily_practice.arrays.remove_element;

import java.util.Arrays;

public class RemoveElementTaskMain {
    public static void main(String[] args) {
        //System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
        System.out.println(removeElement(new int[]{0,3,1,1,0,1,3,0,3,3,1,1}, 1));
    }

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] == val) {
                if (nums[right] != val) {
                    int temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                    left++;
                    right--;
                } else {
                    int temp = nums[--right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                    left++;
                }
            } else {
                left++;
            }
        }
        int result = 0;
        for (int e : nums) {
            if (e != val) {
                result++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return result;
    }
}
