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
         TreeNode m =root;
      if(m.val>p.val&m.val<q.val)
      return m;
      if(m.val>p.val&m.val>q.val)
      return lowestCommonAncestor(root.left,p,q);
      if(m.val<p.val&m.val<q.val)
      return lowestCommonAncestor(root.right,p,q);
      return root;
    }
}