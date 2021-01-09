class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int prevPointer = 0;
        for (int currPointer = 1; currPointer < nums.length; currPointer++) {
            if(nums[currPointer] != nums[prevPointer]) {
                prevPointer++;
                nums[prevPointer] = nums[currPointer];
            } // end if
        } // end for
        
        return prevPointer+1;
    } // end method
} // end class

/* Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array.
Memory Usage: 41.1 MB, less than 29.05% of Java online submissions for Remove Duplicates from Sorted Array.
Time Complexity: O(n)
Space Complexity: O(1)*/
