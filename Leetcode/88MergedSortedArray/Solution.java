class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int array1Pointer = m - 1, array2Pointer = n - 1, index = m + n - 1;
        while(array1Pointer >= 0 && array2Pointer >= 0) {
            if(nums1[array1Pointer] > nums2[array2Pointer]) {
                nums1[index] = nums1[array1Pointer];
                array1Pointer--;
            } else {
                nums1[index] = nums2[array2Pointer];
                array2Pointer--;
            } // end if
            index--;
        } // end while
        
        while(index >= 0) {
            while(array1Pointer >= 0) {
                nums1[index] = nums1[array1Pointer];
                array1Pointer--;
                index--;
            }
            while(array2Pointer >= 0) {
                nums1[index] = nums2[array2Pointer];
                array2Pointer--;
                index--;
            }
        }
        return;
    } // end method
} // end class

/* Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
Memory Usage: 39.3 MB, less than 34.24% of Java online submissions for Merge Sorted Array. 

Time Complexity: O(n+m)
Space Complexity: O(n+m)
*/
