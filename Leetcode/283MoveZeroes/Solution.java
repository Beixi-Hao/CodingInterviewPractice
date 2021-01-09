class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 0) {
            return;
        }
    
        int prevPointer = 0;
        for(int currPointer = 1; currPointer < nums.length; currPointer++) {
            while(currPointer < nums.length - 1 && nums[currPointer] == 0) {
                currPointer++;
            } // end while
            while(nums[prevPointer] != 0 && prevPointer < currPointer) {
                prevPointer++;
            } // end while
            if(nums[prevPointer] == 0 && nums[currPointer] != 0) {
                nums[prevPointer] = nums[currPointer];
                nums[currPointer] = 0;
            }
        } // end for
        
        return;
    } // end method
} // end class

/* Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
Memory Usage: 39.6 MB, less than 23.41% of Java online submissions for Move Zeroes.
Time O(n)
Space O(n)*/
