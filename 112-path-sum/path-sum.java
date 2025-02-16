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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;

        Stack<TreeNode> nodeStack=new Stack<>();
        Stack<Integer> sumOfNode=new Stack<>();
        nodeStack.push(root);
        sumOfNode.push(root.val);

    while(!nodeStack.isEmpty()){
        TreeNode node=nodeStack.pop();
        int sum=sumOfNode.pop();

        if(node.left==null && node.right==null && sum==targetSum){
            return true;
        }
        if(node.right!=null){
            nodeStack.push(node.right);
            sumOfNode.push(node.right.val+sum);
        }

        if(node.left!=null){
            nodeStack.push(node.left);
            sumOfNode.push(node.left.val+sum);
        }
    }

    return false;
    }
}