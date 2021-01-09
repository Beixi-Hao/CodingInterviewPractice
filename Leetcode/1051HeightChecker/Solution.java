class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null || heights.length <= 1) {
            return 0;
        }
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        
        int result = 0;
        for(int i = 0; i < heights.length; i++) {
            if (sorted[i] != heights[i]) {
                result++;
            } // end if
        } // end for
        
        return result;
    } // end method
} // end class

/* Runtime: 1 ms, faster than 79.23% of Java online submissions for Height Checker.
Memory Usage: 36.9 MB, less than 35.79% of Java online submissions for Height Checker.
O(nlogn)
O(n)
*/
