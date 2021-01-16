// Algorithm: use a one-pass hash that stores the complement of each elem in nums
// Running time: O(n) --> see each elem at most once
// Additional space: O(n) --> at most store every complement in hashmap

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> complement = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (complement.containsKey(nums[i])) {
                int[] indices = {complement.get(nums[i]), i};
                return indices;
            } else {
                complement.put(target - nums[i], i);
            }
        }
        
        throw new IllegalArgumentException("No two sum argument found.");
    }
}
