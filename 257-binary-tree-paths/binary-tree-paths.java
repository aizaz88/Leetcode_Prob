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
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> list=new ArrayList<>();
       if(root==null) return list;

       Stack<TreeNode> st=new Stack<>();
       Stack<String> pathSt=new Stack<>();

        st.push(root);
       pathSt.push(String.valueOf(root.val));

       while(!st.isEmpty()){
        TreeNode node=st.pop();
        String path=pathSt.pop();

        if(node.left==null && node.right==null){
            list.add(path);
        }

        if(node.left!=null){
            st.push(node.left);
            pathSt.push(path+"->"+node.left.val);

        }

        if(node.right!=null){
            st.push(node.right);
            pathSt.push(path+"->"+node.right.val);

        }
       }
       return list;
    }
}