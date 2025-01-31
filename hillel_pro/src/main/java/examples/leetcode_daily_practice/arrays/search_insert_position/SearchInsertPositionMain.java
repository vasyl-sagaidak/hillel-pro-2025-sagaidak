package examples.leetcode_daily_practice.arrays.search_insert_position;

public class SearchInsertPositionMain {
    public static void main(String[] args) {
        int[] arr = {3,6,7,8,10};
        // System.out.println(searchInsert(arr, 9));
        System.out.println(searchInsertBestSolution(arr, 9));
    }

    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length -1]) {
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
            }
        }
        for (int j = 0; j < nums.length - 1; j++) {
            if ( target > nums[j] && target < nums[j+1]) {
                result = j+1;
            }
        }
        return result;
    }

    public static int searchInsertBestSolution(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left<=right){

            int mid = (left+right)/2;

            if(nums[mid]<target){
                left = mid + 1;
            } else if (nums[mid]>target) {
                right = mid - 1;
            }else {
                return mid;
            }

        }

        return left;
    }
}
