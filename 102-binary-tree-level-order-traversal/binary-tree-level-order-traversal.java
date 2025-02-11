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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList=new ArrayList<>();
        if(root==null) return resultList;

        Queue<TreeNode> queueEl=new LinkedList<>();
        queueEl.add(root);
        while(!queueEl.isEmpty()){
            int nodes=queueEl.size();
            List<Integer> levelList=new ArrayList<>();
            for(int i=0;i<nodes;i++){
                TreeNode node=queueEl.poll();
                levelList.add(node.val);

            if(node.left!=null) queueEl.add(node.left);
            if(node.right!=null) queueEl.add(node.right);
            }
            resultList.add(levelList);
        }

        return resultList;
    }
}