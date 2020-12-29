class Solution {
    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int lastIndex = arr.length - 1;
        
        // Find the numbers of duplicated zeros
        // stopping when left points beyond the last element in the original array
        // which would be part of the modified array
        for(int left = 0; left <= lastIndex - possibleDups; left++) {
            // counting the zeros
            if(arr[left] == 0) {
                //Edge case: this zero cannot be duplicated for no more space
                // when the left is pointing to the last element to be included
                if(left == lastIndex - possibleDups) {
                    // For this zero just copy without duplication
                    arr[lastIndex] = 0;
                    lastIndex -= 1;
                    break;
                } // end if
                possibleDups++;
            } // end if
        } // end for
        
        // Start backwards from the last element that would be part of the new array
        // Copy zero twice and non zero once
        for(int i = lastIndex - possibleDups; i >= 0; i--) {
            if(arr[i] == 0) {
                arr[i+possibleDups] = 0;
                possibleDups--;
                arr[i+possibleDups] = 0;
            } else {
                arr[i+possibleDups] = arr[i]; 
            } // end if
        } // end for 
        
        return;
    } // end method
} // end class

// Time Complexity: O(2*n) = O(n)
// Space Complexity: O(n) in place
