import java.util.*;

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> pathList = new ArrayList<>();
        if (root == null) return pathList;

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> pathSumStack = new Stack<>();
        Stack<List<Integer>> pathListStack = new Stack<>();

        nodeStack.push(root);
        pathSumStack.push(root.val);
        pathListStack.push(new ArrayList<>(List.of(root.val)));

        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            int sum = pathSumStack.pop();
            List<Integer> path = pathListStack.pop();

            
            if (node.left == null && node.right == null && sum == targetSum) {
                pathList.add(new ArrayList<>(path));
            }

           
            if (node.right != null) {
                nodeStack.push(node.right);
                pathSumStack.push(sum + node.right.val);

                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(node.right.val);
                pathListStack.push(newPath);
            }

            
            if (node.left != null) {
                nodeStack.push(node.left);
                pathSumStack.push(sum + node.left.val);

                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(node.left.val);
                pathListStack.push(newPath);
            }
        }

        return pathList;
    }
}
