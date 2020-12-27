class Solution {
	public int findMaxConsecutiveOnes(int[] nums) {
		int count = 0, max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else {
				max = Math.max(count, max);
				count = 0;
			} // end if
		} // end for

		return Math.max(count, max); 
	} // end method
} // end class


// Time Complexity: O(n)
// Space Complexity: O(n)
