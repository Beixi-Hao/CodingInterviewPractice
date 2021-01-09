class Solution {
    public int[] sortArrayByParity(int[] A) {
        if(A.length == 0) {
            return A;
        }    
        
        int oddPointer = 0, evenPointer = 0;
        for(; oddPointer < A.length; oddPointer++) {
            while(oddPointer < A.length - 1 && A[oddPointer] % 2 != 0) {
                oddPointer++;
            }
            while(evenPointer < A.length - 1&& A[evenPointer] % 2 == 0) {
                evenPointer++;
            }
            if(oddPointer > evenPointer) {
                int temp = A[oddPointer];
                A[oddPointer] = A[evenPointer];
                A[evenPointer] = temp;
            }
        } // end for
        return A;
    } // end method
} // end class

/*Runtime: 1 ms, faster than 98.52% of Java online submissions for Sort Array By Parity.
Memory Usage: 39.9 MB, less than 57.50% of Java online submissions for Sort Array By Parity.
O(n)
O(1) */
