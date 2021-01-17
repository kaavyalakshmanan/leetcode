// Algorithnm: Sliding window using int array to keep track to ASCII characters' indices
// Running time: O(n) --> see every character in s exactly once
// Additional space: O(1) because size of int array is 128

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int longestSubstring = 0;
        // For ASCII --> this initializes an int array with indices going from 0 to 127, all initialized to 0
        int[] chars = new int[128];
        int left = 0;
        int right = 0;
        
        // Left and right are either ends of current window
        while (right < s.length()) {
            left = Math.max(left, chars[s.charAt(right)]);
            longestSubstring = Math.max(longestSubstring, (right-left)+1);
            chars[s.charAt(right)] = right+1;
            right+=1;
        }
        return longestSubstring;
    }
}
