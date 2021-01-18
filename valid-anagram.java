// Algorithm: Use a hash table (int[] size 26 since input will only be English alphabet in lower case)
// Running time: O(n) --> see every character exactly once per pass
// Additional space: O(1) --> constant amount of space (size 26)

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)-'a']++;
            chars[t.charAt(i)-'a']--;
        }
        
        for (int count: chars) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
        
    }
}
