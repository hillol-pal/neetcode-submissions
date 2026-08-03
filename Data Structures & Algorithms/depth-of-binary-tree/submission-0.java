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
    public int maxDepth(TreeNode root) {

        if(root == null)
          return 0;
        
        return findHeight(root);
        
    }

    public int findHeight(TreeNode root){

      if(root == null)
        return 0; 
      int left = findHeight(root.left);
      int right = findHeight(root.right);

      return Math.max(left,right) + 1;



    }
}
