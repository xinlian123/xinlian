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
    public int rob(TreeNode root) {
                     int[] res1 = dfs(root);
    return Math.max(res1[0],res1[1]);
        
    }
             
        public int[] dfs(TreeNode root){
            if(root==null){
            int[] res  ={0,0};
            return res;}
            int[] res = new int[2];
            int[] left = dfs(root.left);
            int[] right = dfs(root.right);
            
            res[0] = root.val+left[1]+right[1];
            res[1] = Math.max(left[0],left[1])+Math.max(right[1],right[0]);
            
      return res;  }
    } 
       
