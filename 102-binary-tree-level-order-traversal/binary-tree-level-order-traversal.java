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
       List<List<Integer>> list=new ArrayList<>();
       //Base case 
       if(root==null) return list;
       Queue<TreeNode> queue=new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty()){
            int nodes=queue.size();
            List<Integer> levelNodes=new ArrayList<>();
            for(int i=0;i<nodes;i++){
                TreeNode node=queue.poll();
                levelNodes.add(node.val);

                //Child nodes
               if(node.left!=null) queue.add(node.left);
               if(node.right!=null) queue.add(node.right);

            }
            list.add(levelNodes);
       }
       return list;
    }
}

