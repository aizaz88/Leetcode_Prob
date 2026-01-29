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
    //(The node we are visiting kth time is the kth smallest...)
    
    int count=0;
    int result=-1;

    public int kthSmallest(TreeNode root, int k) {

        inOrder(root,k);
        return result;
    }
    private void inOrder(TreeNode root,int k){
        if(root==null || result!=-1) return ;

        inOrder(root.left,k);
         count++;
        if(count==k){
            result=root.val;
            return;
        }
        inOrder(root.right,k);
    }
}