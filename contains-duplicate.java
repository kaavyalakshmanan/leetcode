// Algorithm: Use a HashSet to store every distinct num seen so far
// Running time: O(n) --> lookup and add in HashSet is just O(1) and we do this n times
// Additional space: O(n) --> worst case nums contains no duplicates

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> distinct = new HashSet<Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (distinct.contains(nums[i])) {
                return true;
            } 
            distinct.add(nums[i]);
        }
        return false;
    }
}
