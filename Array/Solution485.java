//Given a binary array, find the maximum number of consecutive 1s in this array.

// a more concise way
class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxHere = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, maxHere = nums[i] == 0 ? 0 : maxHere + 1); 
        return max;
    }
}