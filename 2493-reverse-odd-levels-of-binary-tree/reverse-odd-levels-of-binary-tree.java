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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null) return null;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        boolean turn=false;
        
        while(!q.isEmpty()){
            List<TreeNode> levelNodes=new ArrayList<>();

            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                levelNodes.add(node);

                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }

            if(turn){
                int left=0,right=levelNodes.size()-1;
                while(left<right){
                    int temp=levelNodes.get(left).val;
                    levelNodes.get(left).val=levelNodes.get(right).val;
                    levelNodes.get(right).val=temp;
                    left++;
                    right--;
                }
            }
            //Turn change for odd level reverse 
            turn=!turn;
        }
        return root; 
    }
}