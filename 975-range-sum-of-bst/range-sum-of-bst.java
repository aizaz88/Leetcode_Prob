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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        int rangeSum=0;
        while(!q.isEmpty()){
            TreeNode node=q.poll();

            if(node==null) continue;

            if(node.val>=low && node.val<=high){
                rangeSum+=node.val;
            }

            if(node.left!=null && node.val > low)  q.add(node.left);
            if(node.right!=null && node.val <high)  q.add(node.right);
        }

        return rangeSum;
    }
}