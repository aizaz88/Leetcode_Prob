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
    public int sumNumbers(TreeNode root) {

        Stack<TreeNode> nodeStack=new Stack<>();
        Stack<Integer> numStack=new Stack<>();
        
        int totalSum=0;
        nodeStack.add(root);
        numStack.add(root.val);


        while(!nodeStack.isEmpty()){
            TreeNode node=nodeStack.pop();
            int currVal=numStack.pop();

            if(node.left==null && node.right==null){
                totalSum+=currVal;
            }

            if(node.left!=null){
                nodeStack.add(node.left);
                numStack.add(currVal*10 + node.left.val);
            }

             if(node.right!=null){
                nodeStack.add(node.right);
                numStack.add(currVal*10 + node.right.val);
            }
        }

        return totalSum;
    }
}