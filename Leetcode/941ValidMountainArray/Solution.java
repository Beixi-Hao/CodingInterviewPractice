class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean decreaseFlag = false, increaseFlag = false;
        int prev = 0, i;    
        
        for(i = 1; i < arr.length; i++) {
            if (arr[prev] == arr[i]) {
                return false;
            } else if (arr[prev] > arr[i]) {
                decreaseFlag = true;
                break;
            } else {
                increaseFlag = true;
                prev++;
            }
        } // end for
        
        for(; i < arr.length; i++) {
            if(!(arr[prev] > arr[i])) {
                return false;
            } 
            prev++;
        } // end for
        
        return decreaseFlag && increaseFlag;
    } // end method
} // end class

/* Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Mountain Array.
Memory Usage: 40 MB, less than 87.16% of Java online submissions for Valid Mountain Array.
Time O(n)
Space O(1) */
