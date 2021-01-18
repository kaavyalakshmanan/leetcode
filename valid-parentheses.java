// Algorithm: Use a stack
// Running time: O(n) --> see every character at most once
// Additional space: O(n) --> worst case size of stack

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> parens = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                parens.add(s.charAt(i));
            }
            else if (parens.size() == 0 || ((s.charAt(i) == '}' && parens.peek() != '{') || (s.charAt(i) == ']' && parens.peek() != '[') || (s.charAt(i) == ')' && parens.peek() != '('))) {
                return false;
            }
            else {
                parens.pop();
            }
    }
        if (parens.size() != 0) return false;
        return true;
}
}
