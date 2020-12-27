class Solution {
	public int[] sortedSquares(int[] nums) {
		int arrayLength = nums.length;
		int nonNegPointer = 0;
		while(nonNegPointer < arrayLength && nums[nonNegPointer] < 0) {
			nonNegPointer++;
		} // end while
		int negPointer = nonNegPointer - 1;

		int[] ans = new int[arrayLength];
		int index = 0;

		while(negPointer >= 0 && nonNegPointer < arrayLength) {
			if(nums[negPointer] * nums[negPointer] < nums[nonNegPointer] * nums[nonNegPointer]) {
				ans[index++] = nums[negPointer] * nums[negPointer];
				negPointer--;
			} else {
				ans[index++] = nums[nonNegPointer] * nums[nonNegPointer];
				nonNegPointer++;
			} // end if
		} // end while

	while(negPointer >= 0) {
		ans[index++] = nums[negPointer] * nums[negPointer];
		negPointer--;
	} // end while

	while(nonNegPointer < arrayLength) {
		ans[index++] = nums[nonNegPointer] * nums[nonNegPointer];
		nonNegPointer++;
	} // end while

	return ans;
	} // end method
} // end class

// Time Complexity: O(n)
// Space Complexity: O(2*n)
