/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int minDepth(TreeNode root) {
       if(root==null)
       return 0;
     int left = minDepth(root.left);
     int right = minDepth(root.right);
     if(root.left==null||root.right==null)
     return left>right?left+1:right+1;
     return Math.min(left,right)+1;
       
    }
}