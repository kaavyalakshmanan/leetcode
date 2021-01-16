// Algorithm: Compute product of left half, then right half
// Running time: O(n) --> 2 passes and see every elem exactly once in each pass
// Additional space: O(1) because output array does not count

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] output = new int[nums.length];
        int leftProduct = 1;
        
        // Compute product of left half
        for (int i = 0; i < nums.length; i++) {
                output[i] = leftProduct;
                leftProduct*=nums[i];
        }
        
        // Compute product of right half
        int rightProduct = 1;
        for (int i = nums.length-1; i >= 0; i--) {
                output[i] *= rightProduct;
                rightProduct*=nums[i];
        }
        return output; 
    }
}
