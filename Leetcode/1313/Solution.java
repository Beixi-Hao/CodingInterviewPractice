class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }
        int[] ans = new int[size];
        
        int index = 0;
        
        for(int i = 0; i < nums.length; i += 2) {
          int count = nums[i];
          int number = nums[i+1];
          for(int j = 0; j < count; j++){
            ans[index] = number;
            index++;
          } // end for
        } // end for
          
        return ans;

    } // end method decompressRLDlist
} // end class Solution
