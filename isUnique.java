// Algorithm: Bit manipulation
// Running time: O(n)
// Additional space: O(1)
// Assumptions: input string contains lowercase characters a-z

public boolean isUnique(String str) {
  for (int i = 0; i < str.length(); i++) {
    int val = str.charAt(i) - 'a';
    if (val & (1 << val) > 0) {
      return false;
    }
    val |= (1 << val);
 }
 return true;
}
