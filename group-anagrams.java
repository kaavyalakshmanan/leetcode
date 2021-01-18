// Algorithm: Use a hashmap to keep track of strings and their anagrams, where key is a string sorted and value is list of anagrams
// Running time: O(NKlogK) --> where K is the length of the longest word in strs, so it takes KlogK time to sort --> and we do this for every word in strs, therefore N
// Additional space: O(NK) --> in total

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        
        for (String curr: strs) {
            char[] charArray = curr.toCharArray();
            Arrays.sort(charArray);
            String sortedCurr = String.valueOf(charArray);
            if (!map.containsKey(sortedCurr)) {
                map.put(sortedCurr, new ArrayList<String>());
            }
            map.get(sortedCurr).add(curr);
            
        }
        
        return new ArrayList(map.values());    
    }
}
