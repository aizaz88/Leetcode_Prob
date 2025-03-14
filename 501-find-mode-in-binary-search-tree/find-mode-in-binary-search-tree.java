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
    public int[] findMode(TreeNode root) {
        if(root==null) return new int[0];
        Queue<TreeNode> q=new LinkedList<>();

        HashMap<Integer,Integer> freqMap=new HashMap<>();

        q.add(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            //Populate Hash-Map(key,values)
        freqMap.put(node.val,freqMap.getOrDefault(node.val,0)+1);

            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);

        }

        //Extrat most occured keys from FreqMap 
        int maxOcurr=Collections.max(freqMap.values());
        List<Integer> list=new ArrayList<>();

        for(Map.Entry<Integer,Integer> e:freqMap.entrySet()){
            if(e.getValue()==maxOcurr){
                list.add(e.getKey());
            }
        }
        
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}