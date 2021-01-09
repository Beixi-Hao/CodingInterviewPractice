class Solution {
    public int[] runningSum(int[] nums) {
        if(nums.length <= 1) {
            return nums;
        }
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        } // end for
        return nums;
    } // end method
} // end class

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
Memory Usage: 39.3 MB, less than 43.91% of Java online submissions for Running Sum of 1d Array.
O(n)
O(1)
