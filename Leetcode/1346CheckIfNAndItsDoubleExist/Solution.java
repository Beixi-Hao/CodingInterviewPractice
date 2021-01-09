class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer>map = new HashMap<>();
        int half, doubleNum;
        for(int i = 0; i < arr.length; i++) {
            doubleNum = arr[i] * 2;
            if (arr[i] % 2 == 0) {
                half = arr[i] / 2;
            } else {
                half = doubleNum;
            }
            if((map.containsKey(half) && map.get(half) != i) || (map.containsKey(doubleNum) && map.get(doubleNum) != i )) {
                return true;
            } else {
                map.put(arr[i], i);
            }// end if
        } // end for
        return false;
    } // end method
} // end class

/* Runtime: 1 ms, faster than 98.49% of Java online submissions for Check If N and Its Double Exist.
Memory Usage: 38.7 MB, less than 42.21% of Java online submissions for Check If N and Its Double Exist.
Runtime O(n)
Space O(n)
*/
