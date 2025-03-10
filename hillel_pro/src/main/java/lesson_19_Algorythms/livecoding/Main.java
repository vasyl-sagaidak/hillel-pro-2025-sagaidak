package lesson_19_Algorythms.livecoding;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      Solution s = new Solution();
        int[] ints = s.twoSum(new int[]{2, 7, 11, 5}, 18);
        System.out.println(Arrays.toString(ints));

    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                 if(nums[i]+nums[j] == target) {
                     return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
