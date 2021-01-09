class Solution {
    public int removeElement(int[] nums, int val) {
        int valPointer = 0, endPointer = nums.length - 1;
        while(valPointer <= endPointer) {
            if(nums[valPointer] == val)  {
                nums[valPointer] = nums[endPointer];
                endPointer--;
            } else {
                valPointer++;
            } // end if
        } // end while
        
        return endPointer + 1;
    } // end method
} // end class

/* Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
Memory Usage: 37.8 MB, less than 31.84% of Java online submissions for Remove Element.
Time Complexity: O(n)
Space Complexity: O(1)
*/
