class Solution {
    public int[] replaceElements(int[] arr) {
        int prev = arr[arr.length-1];
        arr[arr.length-1] = -1;
        int max = -1;
        
        for (int i = arr.length - 2; i >= 0; i--) {
            max = Math.max(max, prev);
            prev = arr[i];
            arr[i] = max;
            
        }
        return arr;
    }
}

/* Runtime: 1 ms, faster than 99.86% of Java online submissions for Replace Elements with Greatest Element on Right Side.
Memory Usage: 40.5 MB, less than 38.06% of Java online submissions for Replace Elements with Greatest Element on Right Side.
Time - O(n)
Space - O(1) */
