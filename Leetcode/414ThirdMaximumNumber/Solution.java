class Solution {
    public int thirdMax(int[] nums) {
        Integer max1 = null, max2 = null, max3 = null;
        
        for(Integer num : nums) {
            if(num.equals(max1) || num.equals(max2) || num.equals(max3)) {
                continue;
            } // end if
            if(max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if(max2 == null || num > max2) {
                max3 = max2;
                max2 = num;
            } else if(max3 == null || num > max3) {
                max3 = num;
            } // end if
        } // end for
        return max3 == null? max1 : max3;
    } // end method
} // end class

/* 
Runtime: 2 ms, faster than 66.59% of Java online submissions for Third Maximum Number.
Memory Usage: 38.8 MB, less than 53.82% of Java online submissions for Third Maximum Number.
O(n)
O(1)*/
