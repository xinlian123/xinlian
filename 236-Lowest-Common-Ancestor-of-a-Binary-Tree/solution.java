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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if(root==null||root==p||root==q)
    {return root;}
    TreeNode Left = lowestCommonAncestor(root.left, p, q);
    TreeNode Right = lowestCommonAncestor(root.right,p,q);
    if(Left!=null&&Right!=null)
    return root;
    return (Left!=null)?Left:Right;
    }
}