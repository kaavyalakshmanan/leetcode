// Algorithm: see below
// Running time for Sol1 and 2: O(n) --> see every elem exactly once
// Additional space: O(1) --> Sol 1 uses constants and Sol 2 memoizes input array

class Solution {
    public int maxSubArray(int[] nums) {
        
        // Naiive approach: Find the maxSubArray starting at each position in nums
        // There will be n candidate end positions and O(n) work each time to compute sum
        // This is cubic: O(n^3) --> very very suboptimal
        
        // Slightly less naiive approach: Find the maxSubArray starting at each position in nums
        // Keep track of sum preceding current elem and add to current elem so don't have to recompute
        // There will still be n candidate end positions but no longer O(n) work each time to compute sum
        // This is quadratic: (On^2) --> but we can still do better
        
        // Solution 1: Sliding window
        // Algorithm: for each elem in nums, we make a choice: either the maxSubArray starts and ends with that elem, or just ends with that elem --> depending on which is larger
        // Keep track of globalMax and localMax and return larger of the two
        
//         int globalMax = Integer.MIN_VALUE;
//         int localMax = 0;
        
//         for (int i = 0; i < nums.length; ++i) {
//             localMax = Math.max(nums[i], nums[i]+localMax);
//             globalMax = Math.max(globalMax, localMax);
//         }
        
//         return Math.max(globalMax, localMax);
        
        // Solution 2: DP (Kadene's Algorithm)
        // Algorithm: do what is done above, except maintain the maxSumSubarray at each elem in nums itself (this is what makes it DP; other families of problems can be reduced to this)
        // We don't need to sum current elem with sum of preceding contigious subarray if latter < 0 --> same logic as Solution 1
        
        int maxSubarray = nums[0];
        
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i-1] > 0) {
                nums[i]+=nums[i-1];
            }
            maxSubarray = Math.max(maxSubarray, nums[i]);
        }
        
        return maxSubarray;
        
        // For both solutions, a subtle optimization is to do ++i instead of i++ --> which increments i before expression is evaluated 
        
    }
}
