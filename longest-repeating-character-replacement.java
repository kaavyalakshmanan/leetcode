// Algorithm: sliding window where count[26] is used to keep track of count of specific character (based on index) in current window
// globalMaxLength --> what gets returned
// maxCount --> help us ensure num operations does not exceed k
// Running time: O(n) --> see every character exactly once
// Additional space: O(1) because size of int array is constant --> 26

class Solution {
    public int characterReplacement(String s, int k) {

        // Sliding Window --> left, right
        int left = 0; 
        int[] count = new int[26]; // keep track of count of each character in current window
        int globalMaxLength = 0; // global length of window 
        int maxCount = 0; // make sure num operations does not exceed k
        
        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']+=1;
            maxCount = Math.max(maxCount, count[s.charAt(right)-'A']);
            while ((right-left)+1 - maxCount > k) {
                // Our window is no longer valid, we need to shrink it
                count[s.charAt(left)-'A']-=1;
                left+=1;
            }
            globalMaxLength = Math.max(globalMaxLength, (right-left)+1);
        }
        
        return globalMaxLength;
        
        
    }
}
