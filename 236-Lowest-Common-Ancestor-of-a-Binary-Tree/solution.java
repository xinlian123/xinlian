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
      if(root==null||p==null||q==null)
    {return root;}
    TreeNode Left = lowestCommonAncestor(root.left, p, q);
    TreeNode Right = lowestCommonAncestor(root.right,p,q);
    if(left!=null&&right!=null)
    return root;
    return (left!=null)?left:right;
    }
}