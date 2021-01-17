// Algorithm: Just like the maxSubarray, we use DP (Kadene's Algo) except this problem has a twist: the product of 2 -ve numbers is +ve, therefore we cannot be hasty in disregarding a -ve number like we could for maxSubarray
// So we maintain a globalMax (max in entire array), maxEndingHere (max product if we ended at curr index), minEndingHere (min product if we ended at curr index)
// We care about minEndingHere in case the current elem is -ve --> in which case multiplying with minEndingHere could yield a larger +ve result 
// Running time: O(n) --> we see every elem exactly once
// Additional space: O(1)--> we maintain some constants 


class Solution {
    public int maxProduct(int[] nums) {
        
        int globalMax = nums[0];
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        
        for (int i = 1; i < nums.length; ++i) {
            int temp = maxEndingHere;
            maxEndingHere = Math.max(nums[i], Math.max(maxEndingHere * nums[i], minEndingHere * nums[i]));
            minEndingHere = Math.min(nums[i], Math.min(temp * nums[i], minEndingHere * nums[i]));
            globalMax = Math.max(globalMax, maxEndingHere);
        }
        
        return globalMax;
    }
}
