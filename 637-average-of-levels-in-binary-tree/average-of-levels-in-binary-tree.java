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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        if(root==null) return result;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int levelSize=q.size();
            double avg=0;
            for(int i=0;i<levelSize;i++){
                TreeNode node=q.poll();
                avg+=node.val;

                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            result.add(avg/levelSize);
        }

        return result;
    }
}