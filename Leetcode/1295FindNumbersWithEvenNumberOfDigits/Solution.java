class Solution {
	public int findNumbers(int[] nums) {
		int count = 0, digit;
		
		for(int i = 0; i < nums.length; i++) {
			digit = 1;
		
			while(nums[i] / 10 != 0) {
				digit++;
				nums[i] /= 10;
			} // end while
		
			if(digit % 2 == 0) {
				count++;
			} // end if
		} // end for

		return count;
	} // end method
} // end class

// Time Complexity: O(n*m) n - length of array, m - number of digits of each num
// Space Complexity: O(n)
