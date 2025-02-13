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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        boolean left_right=true;

        while(!q.isEmpty()){
            int nodes=q.size();
            List<Integer> levels=new LinkedList<>();
            for(int i=0;i<nodes;i++){
                TreeNode node=q.poll();

                if(left_right){
                    levels.addLast(node.val);
                }else{
                    levels.addFirst(node.val);
                }

                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
        left_right=!left_right;
        result.add(levels);  
    }
    return result;
        }
    }