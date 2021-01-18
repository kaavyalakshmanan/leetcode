// Algorithm: recurse
// Running time: O(n) --> see each node exactly once
// Additional space: O(n) worst case if tree is unbalanced 

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        
        if (root == null) {
            return maxDepth;
        }
        // maxDepth+=1;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
        
        
    }
}
